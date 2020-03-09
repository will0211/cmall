
package com.cmall.provider.service.hystrix;

import com.cmall.provider.model.dto.OrderDto;
import com.cmall.provider.service.OmcOrderFeignApi;
import com.cmall.wrapper.Wrapper;
import org.springframework.stereotype.Component;

/**
 * The class Omc order feign hystrix.
 *
 */
@Component
public class OmcOrderFeignHystrix implements OmcOrderFeignApi {

	@Override
	public Wrapper updateOrderById(final OrderDto order) {
		return null;
	}
}
