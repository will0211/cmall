
package com.cmall.provider.service;

import com.cmall.provider.model.dto.OrderDetailDto;
import com.cmall.provider.service.hystrix.OmcOrderDetailQueryFeignHystrix;
import com.cmall.security.feign.OAuth2FeignAutoConfiguration;
import com.cmall.wrapper.Wrapper;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * The interface Omc order detail query feign api.
 *
 */
@FeignClient(value = "cmall-service-omc", configuration = OAuth2FeignAutoConfiguration.class, fallback = OmcOrderDetailQueryFeignHystrix.class)
public interface OmcOrderDetailQueryFeignApi {
	/**
	 * Gets list by order no user id.
	 *
	 * @param orderNo the order no
	 * @param userId  the user id
	 *
	 * @return the list by order no user id
	 */
	@PostMapping(value = "/api/orderDetail/getListByOrderNoUserId/{userId}/{orderNo}")
	Wrapper<List<OrderDetailDto>> getListByOrderNoUserId(@PathVariable("orderNo") String orderNo, @PathVariable("userId") Long userId);
}
