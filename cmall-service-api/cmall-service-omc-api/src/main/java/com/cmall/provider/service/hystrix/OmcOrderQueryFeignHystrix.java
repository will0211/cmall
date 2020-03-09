
package com.cmall.provider.service.hystrix;

import com.cmall.provider.model.dto.OrderDto;
import com.cmall.provider.service.OmcOrderQueryFeignApi;
import com.cmall.wrapper.Wrapper;
import org.springframework.stereotype.Component;

/**
 * The class Omc order query feign hystrix.
 *
 */
@Component
public class OmcOrderQueryFeignHystrix implements OmcOrderQueryFeignApi {


	@Override
	public Wrapper<OrderDto> queryByOrderNo(final String orderNo) {
		return null;
	}

	@Override
	public Wrapper<OrderDto> queryByUserIdAndOrderNo(final Long userId, final String orderNo) {
		return null;
	}
}
