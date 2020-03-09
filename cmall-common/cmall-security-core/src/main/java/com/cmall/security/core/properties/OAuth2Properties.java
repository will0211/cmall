
package com.cmall.security.core.properties;

import lombok.Data;

/**
 * The class O auth 2 properties.
 *
 */
@Data
public class OAuth2Properties {

	/**
	 * 使用jwt时为token签名的秘钥
	 */
	private String jwtSigningKey = "cmall";
	/**
	 * 客户端配置
	 */
	private OAuth2ClientProperties[] clients = {};

}
