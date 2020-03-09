
package com.cmall.provider.service;


import com.github.pagehelper.PageInfo;
import com.cmall.base.dto.MessageQueryDto;
import com.cmall.base.dto.MqMessageVo;
import com.cmall.base.enums.ErrorCodeEnum;
import com.cmall.provider.exceptions.TpcBizException;
import com.cmall.provider.model.dto.robot.ChatRobotMsgDto;
import com.cmall.wrapper.Wrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * The class Opc rpc service.
 *
 */
@Slf4j
@Component
public class OpcRpcService {

	@Resource
	private DingtalkFeignApi dingtalkFeignApi;
	@Resource
	private OpcOssFeignApi opcOssFeignApi;
	@Resource
	private OpcMqMessageFeignApi opcMqMessageFeignApi;

	/**
	 * Send chat robot msg boolean.
	 *
	 * @param chatRobotMsgDto the chat robot msg dto
	 *
	 * @return the boolean
	 */
	public boolean sendChatRobotMsg(ChatRobotMsgDto chatRobotMsgDto) {
		Wrapper<Boolean> result = dingtalkFeignApi.sendChatRobotMsg(chatRobotMsgDto);
		return result.getResult();
	}

	/**
	 * Delete expire file.
	 */
	public void deleteExpireFile() {
		opcOssFeignApi.deleteExpireFile();
	}

	public Wrapper<PageInfo<MqMessageVo>> queryMessageListWithPage(final MessageQueryDto messageQueryDto) {
		Wrapper<PageInfo<MqMessageVo>> wrapper = opcMqMessageFeignApi.queryMessageListWithPage(messageQueryDto);
		if (wrapper == null) {
			log.error("查询消息记录 失败 result is null");
			throw new TpcBizException(ErrorCodeEnum.GL99990002);
		}
		return wrapper;
	}
}