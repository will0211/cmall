
package com.cmall.provider.service.hystrix;

import com.cmall.provider.model.dto.GlobalExceptionLogDto;
import com.cmall.provider.service.MdcExceptionLogFeignApi;
import com.cmall.wrapper.Wrapper;
import org.springframework.stereotype.Component;


/**
 * The class Mdc exception log feign hystrix.
 *
 */
@Component
public class MdcExceptionLogFeignHystrix implements MdcExceptionLogFeignApi {

	@Override
	public Wrapper saveAndSendExceptionLog(final GlobalExceptionLogDto exceptionLogDto) {
		return null;
	}
}
