
package com.cmall.provider.service;

import com.cmall.provider.model.dto.gaode.GaodeLocation;
import com.cmall.provider.service.hystrix.OpcGaodeFeignApiHystrix;
import com.cmall.security.feign.OAuth2FeignAutoConfiguration;
import com.cmall.wrapper.Wrapper;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * The interface Opc gao feign api.
 *
 */
@FeignClient(value = "cmall-service-opc", configuration = OAuth2FeignAutoConfiguration.class, fallback = OpcGaodeFeignApiHystrix.class)
public interface OpcGaodeFeignApi {

	/**
	 * IP定位.
	 *
	 * @param ipAddr the ip addr
	 *
	 * @return the location by ip addr
	 */
	@PostMapping(value = "/api/auth/getLocationByIpAddr")
	Wrapper<GaodeLocation> getLocationByIpAddr(@RequestParam("ipAddr") String ipAddr);
}
