
package com.cmall.provider.mq.producer;

import com.cmall.base.constant.AliyunSmsConstants;
import com.cmall.provider.model.entity.MqMessageData;
import com.cmall.provider.model.dto.sms.SmsMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * The class Sms producer.
 *
 */
@Slf4j
@Component
public class SmsProducer {

	public MqMessageData sendSmsCodeMq(SmsMessage smsMessage, AliyunSmsConstants.SmsTempletEnum templetEnum) {
		log.info("sendSmsCodeMq - 发送短信验证码. smsMessage={}", smsMessage);
		String msgBody;
//		try {

//			PcSendSmsRequest request = new PcSendSmsRequest();
//			Map<String, String> map = Maps.newHashMap();
//			// 模板参数
//			String smsParamName = templetEnum.getSmsParamName();
//			// 模板编码
//			String templetCode = templetEnum.getTempletCode();
//			//替换模板验证码
//			map.put(smsParamName, smsMessage.getSmsCode());
//			String param = JSON.toJSONString(map);
//
//			request.setPhoneNumbers(smsMessage.getMobileNo());
//			request.setTemplateCode(templetCode);
//			request.setTemplateParam(param);
//			request.setOutId(smsMessage.getOutId());
//
//			msgBody = JSON.toJSONString(request);
//		} catch (Exception e) {
//			log.error("发送短信验证码 smsMessage转换为json字符串失败", e);
//			throw new UacBizException(ErrorCodeEnum.UAC10011022);
//		}
//		String topic = AliyunMqTopicConstants.MqTopicEnum.SEND_SMS_TOPIC.getTopic();
//		String tag = AliyunMqTopicConstants.MqTagEnum.REGISTER_USER_AUTH_CODE.getTag();
//		String key = RedisKeyUtil.createMqKey(topic, tag, smsMessage.getMobileNo(), msgBody);
//		return new MqMessageData(msgBody, topic, tag, key);
			return null;
	}
}
