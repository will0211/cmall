package com.cmall.security.core.properties;

import lombok.Data;

/**
 * 社交登录配置项
 *
 * @author paascloud.net @gmail.com
 */
@Data
public class SocialProperties {

	/**
	 * 社交登录功能拦截的url
	 */
	private String filterProcessesUrl = "/auth";

	private QQProperties qq = new QQProperties();
//
	private WeixinProperties weixin = new WeixinProperties();

	public String getFilterProcessesUrl() {
		return filterProcessesUrl;
	}

	public void setFilterProcessesUrl(String filterProcessesUrl) {
		this.filterProcessesUrl = filterProcessesUrl;
	}

}
