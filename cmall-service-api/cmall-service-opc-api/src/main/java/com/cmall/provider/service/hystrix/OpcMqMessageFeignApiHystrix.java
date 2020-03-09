
package com.cmall.provider.service.hystrix;


import com.github.pagehelper.PageInfo;
import com.cmall.base.dto.MessageQueryDto;
import com.cmall.base.dto.MqMessageVo;
import com.cmall.provider.service.OpcMqMessageFeignApi;
import com.cmall.wrapper.Wrapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * The class Opc mq message feign api hystrix.
 *
 */
@Component
public class OpcMqMessageFeignApiHystrix implements OpcMqMessageFeignApi {

	@Override
	public Wrapper<List<String>> queryMessageKeyList(final List<String> messageKeyList) {
		return null;
	}

	@Override
	public Wrapper<PageInfo<MqMessageVo>> queryMessageListWithPage(final MessageQueryDto messageQueryDto) {
		return null;
	}
}
