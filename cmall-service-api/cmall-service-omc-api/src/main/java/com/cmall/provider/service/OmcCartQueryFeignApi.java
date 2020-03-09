
package com.cmall.provider.service;

import com.cmall.provider.model.vo.CartVo;
import com.cmall.provider.service.hystrix.OmcCartQueryFeignHystrix;
import com.cmall.security.feign.OAuth2FeignAutoConfiguration;
import com.cmall.wrapper.Wrapper;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * The interface Omc cart query feign api.
 *
 */
@FeignClient(value = "cmall-service-omc", configuration = OAuth2FeignAutoConfiguration.class, fallback = OmcCartQueryFeignHystrix.class)
public interface OmcCartQueryFeignApi {

	/**
	 * Gets cart vo.
	 *
	 * @param userId the user id
	 *
	 * @return the cart vo
	 */
	@PostMapping(value = "/api/cart/getCarVo")
	Wrapper<CartVo> getCartVo(@RequestParam("userId") Long userId);
}
