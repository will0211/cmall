
package com.cmall.security.core.properties;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 微信登录配置项
 *
 * @author paascloud.net @gmail.com
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class WeixinProperties extends com.cmall.security.core.social.weixin.config.SocialProperties {

	/**
	 * 第三方id，用来决定发起第三方登录的url，默认是 weixin。
	 */
	private String providerId = "weixin";
}
