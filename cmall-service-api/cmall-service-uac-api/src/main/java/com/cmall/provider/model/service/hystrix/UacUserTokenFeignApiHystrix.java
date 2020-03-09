
package com.cmall.provider.model.service.hystrix;


import com.cmall.wrapper.Wrapper;
import com.cmall.provider.model.service.UacUserTokenFeignApi;
import org.springframework.stereotype.Component;

/**
 * The class Uac user token feign api hystrix.
 *
 */
@Component
public class UacUserTokenFeignApiHystrix implements UacUserTokenFeignApi {

	@Override
	public Wrapper<Integer> updateTokenOffLine() {
		return null;
	}
}
