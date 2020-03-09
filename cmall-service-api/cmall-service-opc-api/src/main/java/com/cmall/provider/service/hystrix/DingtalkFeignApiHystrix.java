
package com.cmall.provider.service.hystrix;


import com.cmall.provider.model.dto.robot.ChatRobotMsgDto;
import com.cmall.provider.service.DingtalkFeignApi;
import com.cmall.wrapper.Wrapper;
import org.springframework.stereotype.Component;


/**
 * The class Chat robot feign api hystrix.
 *
 */
@Component
public class DingtalkFeignApiHystrix implements DingtalkFeignApi {

	@Override
	public Wrapper<Boolean> sendChatRobotMsg(final ChatRobotMsgDto uacUserReqDto) {
		return null;
	}
}
