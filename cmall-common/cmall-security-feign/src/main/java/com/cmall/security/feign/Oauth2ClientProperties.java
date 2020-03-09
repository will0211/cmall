
package com.cmall.security.feign;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The class Oauth 2 client properties.
 *
 */
@Data
@ConfigurationProperties(prefix = "cmall.oauth2.client")
public class Oauth2ClientProperties {
	private String id;
	private String accessTokenUrl;
	private String clientId;
	private String clientSecret;
	private String clientAuthenticationScheme;
}

