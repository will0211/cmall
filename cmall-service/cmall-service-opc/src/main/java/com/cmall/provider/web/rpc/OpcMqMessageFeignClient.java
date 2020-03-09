
package com.cmall.provider.web.rpc;


import com.github.pagehelper.PageInfo;
import com.cmall.base.dto.MessageQueryDto;
import com.cmall.base.dto.MqMessageVo;
import com.cmall.core.support.BaseController;
import com.cmall.provider.service.MqMessageService;
import com.cmall.provider.service.OpcMqMessageFeignApi;
import com.cmall.wrapper.WrapMapper;
import com.cmall.wrapper.Wrapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Mq 消息.
 *
 */
@RestController
@Api(value = "API - OpcMqMessageFeignClient", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class OpcMqMessageFeignClient extends BaseController implements OpcMqMessageFeignApi {
	@Resource
	private MqMessageService mqMessageService;

	@Override
	@ApiOperation(httpMethod = "POST", value = "查询含有的messageKey")
	public Wrapper<List<String>> queryMessageKeyList(@RequestParam("messageKeyList") List<String> messageKeyList) {
		logger.info("查询消息KEY. messageKeyList={}", messageKeyList);
		return WrapMapper.ok(mqMessageService.queryMessageKeyList(messageKeyList));
	}

	@Override
	public Wrapper<PageInfo<MqMessageVo>> queryMessageListWithPage(@RequestBody MessageQueryDto messageQueryDto) {
		return mqMessageService.queryMessageListWithPage(messageQueryDto);
	}
}
