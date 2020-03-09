
package com.cmall.provider.service;

import com.cmall.provider.service.hystrix.OmcOrderDetailFeignHystrix;
import com.cmall.security.feign.OAuth2FeignAutoConfiguration;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * The interface Omc order detail feign api.
 *
 */
@FeignClient(value = "cmall-service-omc", configuration = OAuth2FeignAutoConfiguration.class, fallback = OmcOrderDetailFeignHystrix.class)
public interface OmcOrderDetailFeignApi {
}
