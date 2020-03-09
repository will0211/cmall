package com.cmall.provider.service.impl;

import com.cmall.provider.model.dto.sms.SmsMessage;
import com.cmall.provider.service.SmsService;
import com.google.common.base.Preconditions;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.concurrent.TimeUnit;

/**
 * The class Sms service.
 *
 */
@Slf4j
@Service
public class SmsServiceImpl implements SmsService {
//	@Resource
//	private SmsProducer smsProducer;
//	@Resource
//	private UacUserService uacUserService;
//	@Resource
//	private RedisTemplate<String, Object> redisTemplate;
//	@Resource
//	private UserManager userManager;

	@Override
	public void sendSmsCode(SmsMessage smsMessage, String ipAddr) {
//		Preconditions.checkArgument(smsMessage != null, "短信参数不能为空");
//		Preconditions.checkArgument(StringUtils.isNotEmpty(ipAddr), "非法的IP地址");
//		String mobileNo = smsMessage.getMobileNo();
//		Preconditions.checkArgument(StringUtils.isNotEmpty(mobileNo), "手机号码不能为空");
//		String smsTemplateCode = smsMessage.getSmsTemplateCode();
//
//		Preconditions.checkArgument(AliyunSmsConstants.SmsTempletEnum.isSmsTemplate(smsTemplateCode), "短信模板没有维护");
//
//		smsMessage.setMobileNo(mobileNo);
//		smsMessage.setOutId(ipAddr);
//		AliyunSmsConstants.SmsTempletEnum templetEnum = AliyunSmsConstants.SmsTempletEnum.getEnum(smsTemplateCode);
//		MqMessageData mqMessageData = smsProducer.sendSmsCodeMq(smsMessage, templetEnum);
//		userManager.sendSmsCode(mqMessageData);

	}

	@Override
	public String submitResetPwdPhone(String mobile, HttpServletResponse response) {
//		Preconditions.checkArgument(StringUtils.isNotEmpty(mobile), "手机号码不能为空");
//		Preconditions.checkArgument(PubUtils.isMobileNumber(mobile), "手机号码格式不正确");
//
//		String resetPwdKey = PubUtils.uuid() + UniqueIdGenerator.generateId();
//
//		UacUser user = uacUserService.findByMobileNo(mobile);
//		redisTemplate.opsForValue().set(RedisKeyUtil.getResetPwdTokenKey(resetPwdKey), user, 10, TimeUnit.MINUTES);
//		CookieUtil.setCookie("PASSCLOUD_PAAS_resetPwdKey", resetPwdKey, 10 * 60, response);
//		return resetPwdKey;
		return null;
	}
}
