
package com.cmall.provider.service.hystrix;

import com.cmall.provider.model.dto.OrderDetailDto;
import com.cmall.provider.service.OmcOrderDetailQueryFeignApi;
import com.cmall.wrapper.Wrapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * The class Omc order detail query feign hystrix.
 *
 */
@Component
public class OmcOrderDetailQueryFeignHystrix implements OmcOrderDetailQueryFeignApi {

	@Override
	public Wrapper<List<OrderDetailDto>> getListByOrderNoUserId(final String orderNo, final Long userId) {
		return null;
	}
}
