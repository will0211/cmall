
package com.cmall.provider.service;

import com.cmall.provider.service.hystrix.MdcProductCategoryFeignHystrix;
import com.cmall.security.feign.OAuth2FeignAutoConfiguration;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * The interface Mdc product category feign api.
 *
 */
@FeignClient(value = "cmall-service-mdc", configuration = OAuth2FeignAutoConfiguration.class, fallback = MdcProductCategoryFeignHystrix.class)
public interface MdcProductCategoryFeignApi {

}
