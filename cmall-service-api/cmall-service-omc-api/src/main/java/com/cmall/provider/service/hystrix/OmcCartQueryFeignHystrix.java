
package com.cmall.provider.service.hystrix;

import com.cmall.provider.model.vo.CartVo;
import com.cmall.provider.service.OmcCartQueryFeignApi;
import com.cmall.wrapper.Wrapper;
import org.springframework.stereotype.Component;

/**
 * The class Omc cart query feign hystrix.
 *
 */
@Component
public class OmcCartQueryFeignHystrix implements OmcCartQueryFeignApi {

	@Override
	public Wrapper<CartVo> getCartVo(final Long userId) {
		return null;
	}
}
