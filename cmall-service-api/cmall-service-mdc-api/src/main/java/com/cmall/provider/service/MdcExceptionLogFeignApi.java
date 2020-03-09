
package com.cmall.provider.service;

import com.cmall.provider.model.dto.GlobalExceptionLogDto;
import com.cmall.provider.service.hystrix.MdcExceptionLogFeignHystrix;
import com.cmall.security.feign.OAuth2FeignAutoConfiguration;
import com.cmall.wrapper.Wrapper;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * The interface Mdc product feign api.
 *
 */
@FeignClient(value = "cmall-service-mdc", configuration = OAuth2FeignAutoConfiguration.class, fallback = MdcExceptionLogFeignHystrix.class)
public interface MdcExceptionLogFeignApi {

	/**
	 * Update product stock by id int.
	 *
	 * @param exceptionLogDto the exception log dto
	 *
	 * @return the int
	 */
	@PostMapping(value = "/api/exception/saveAndSendExceptionLog")
	Wrapper saveAndSendExceptionLog(@RequestBody GlobalExceptionLogDto exceptionLogDto);
}
