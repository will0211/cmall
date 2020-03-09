
package com.cmall.provider.config;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.cmall.config.properties.CmallProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * The class Aliyun sms configuration.
 *
 */
@Slf4j
@Configuration
public class AliyunSmsConfiguration {

	@Resource
	private CmallProperties cmallProperties;

	/**
	 * Acs client acs client.
	 *
	 * @return the acs client
	 *
	 * @throws ClientException the client exception
	 */
	@Bean
	public IAcsClient acsClient() throws ClientException {
		log.info("SMS Bean IAcsClient Start");
		IClientProfile profile = DefaultProfile.getProfile(cmallProperties.getAliyun().getSms().getRegionId(), cmallProperties.getAliyun().getKey().getAccessKeyId(), cmallProperties.getAliyun().getKey().getAccessKeySecret());
		DefaultProfile.addEndpoint(cmallProperties.getAliyun().getSms().getEndpointName(), cmallProperties.getAliyun().getSms().getRegionId(), cmallProperties.getAliyun().getSms().getProduct(), cmallProperties.getAliyun().getSms().getDomain());
		DefaultAcsClient defaultAcsClient = new DefaultAcsClient(profile);
		log.info("加载SMS Bean IAcsClient OK");
		return defaultAcsClient;
	}

}
