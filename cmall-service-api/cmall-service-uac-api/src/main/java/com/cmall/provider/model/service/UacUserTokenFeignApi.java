
package com.cmall.provider.model.service;


import com.cmall.provider.model.service.hystrix.UacUserTokenFeignApiHystrix;
import com.cmall.wrapper.Wrapper;
import com.cmall.security.feign.OAuth2FeignAutoConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * The interface Uac user token feign api.
 *
 */
@FeignClient(value = "cmall-provider-uac", configuration = OAuth2FeignAutoConfiguration.class, fallback = UacUserTokenFeignApiHystrix.class)
public interface UacUserTokenFeignApi {

	/**
	 * 超时token更新为离线.
	 *
	 * @return the wrapper
	 */
	@PostMapping(value = "/api/uac/token/updateTokenOffLine")
	Wrapper<Integer> updateTokenOffLine();
}
