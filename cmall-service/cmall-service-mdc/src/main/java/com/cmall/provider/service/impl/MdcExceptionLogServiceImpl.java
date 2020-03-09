
package com.cmall.provider.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.cmall.base.constant.GlobalConstant;
import com.cmall.core.support.BaseService;
import com.cmall.provider.mapper.MdcExceptionLogMapper;
import com.cmall.provider.model.domain.MdcExceptionLog;
import com.cmall.provider.model.dto.GlobalExceptionLogDto;
import com.cmall.provider.model.dto.MdcExceptionQueryDto;
import com.cmall.provider.model.dto.robot.ChatRobotMsgDto;
import com.cmall.provider.model.factory.ChatRobotMsgFactory;
import com.cmall.provider.service.MdcExceptionLogService;
import com.cmall.provider.service.OpcRpcService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * The class Mdc exception log service.
 *
 */
@Service
public class MdcExceptionLogServiceImpl extends BaseService<MdcExceptionLog> implements MdcExceptionLogService {
	@Resource
	private MdcExceptionLogMapper mdcExceptionLogMapper;
	@Resource
	private TaskExecutor taskExecutor;
	@Resource
	private OpcRpcService opcRpcService;
	@Value("${cmall.dingTalk.webhookToken.sendException}")
	private String webhookToken;

	@Override
	public void saveAndSendExceptionLog(final GlobalExceptionLogDto exceptionLogDto) {
		MdcExceptionLog exceptionLog = new ModelMapper().map(exceptionLogDto, MdcExceptionLog.class);

		exceptionLog.setId(generateId());
		exceptionLog.setCreateTime(new Date());
		mdcExceptionLogMapper.insertSelective(exceptionLog);

		taskExecutor.execute(() -> {
			if (judgeIsSend(exceptionLogDto.getProfile())) {
				String text = exceptionLog.getApplicationName() + "出现异常. 环境：" + exceptionLogDto.getProfile() + "，操作人：" + exceptionLogDto.getCreator() + ".异常类型：" + exceptionLogDto.getExceptionSimpleName();
				ChatRobotMsgDto chatRobotMsgDto = ChatRobotMsgFactory.createChatRobotTextMsg(webhookToken, text, false, null);
				opcRpcService.sendChatRobotMsg(chatRobotMsgDto);
			}
		});

	}

	@Override
	public PageInfo queryExceptionListWithPage(final MdcExceptionQueryDto mdcExceptionQueryDto) {
		PageHelper.startPage(mdcExceptionQueryDto.getPageNum(), mdcExceptionQueryDto.getPageSize());
		List<MdcExceptionLog> actionList = mdcExceptionLogMapper.queryExceptionListWithPage(mdcExceptionQueryDto);
		return new PageInfo<>(actionList);
	}

	private boolean judgeIsSend(String profile) {
		Calendar calendar = Calendar.getInstance();
		int time = calendar.get(Calendar.HOUR_OF_DAY);
		return GlobalConstant.PRO_PROFILE.equals(profile) || time >= 10 && time <= 18;
	}
}