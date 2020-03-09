

package com.cmall.discovery.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 项目名称：SpringCloud搭建企业级分布式微服务平台
 * 类名称：CmallEurekaApplication.java
 * 创建人：半兽人
 * 联系方式：44110695@qq.com
 * 官网: www.chilangedu.com
 */
@EnableEurekaServer
@SpringBootApplication
public class CmallEurekaApplication {

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(CmallEurekaApplication.class, args);
	}
//	@EnableWebSecurity
//	static class WebSecurityConfig extends WebSecurityConfigurerAdapter{
//		@Override
//		protected void configure(HttpSecurity http) throws Exception {
//			super.configure(http);
//			http.csrf().disable();
//		}
//	}
}
