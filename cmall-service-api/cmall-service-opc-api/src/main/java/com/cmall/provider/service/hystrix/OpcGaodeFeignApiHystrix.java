
package com.cmall.provider.service.hystrix;

import com.cmall.provider.model.dto.gaode.GaodeLocation;
import com.cmall.provider.service.OpcGaodeFeignApi;
import com.cmall.wrapper.Wrapper;
import org.springframework.stereotype.Component;

/**
 * The class Opc oss feign api hystrix.
 *
 */
@Component
public class OpcGaodeFeignApiHystrix implements OpcGaodeFeignApi {

	@Override
	public Wrapper<GaodeLocation> getLocationByIpAddr(final String ipAddr) {
		return null;
	}
}
