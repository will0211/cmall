
package com.cmall.provider.service;

import com.cmall.provider.model.dto.ProductDto;
import com.cmall.provider.service.hystrix.MdcProductFeignHystrix;
import com.cmall.security.feign.OAuth2FeignAutoConfiguration;
import com.cmall.wrapper.Wrapper;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * The interface Mdc product feign api.
 *
 */
@FeignClient(value = "cmall-service-mdc", configuration = OAuth2FeignAutoConfiguration.class, fallback = MdcProductFeignHystrix.class)
public interface MdcProductFeignApi {

	/**
	 * Update product stock by id int.
	 *
	 * @param productDto the product dto
	 *
	 * @return the int
	 */
	@PostMapping(value = "/api/product/updateProductStockById")
	Wrapper<Integer> updateProductStockById(@RequestBody ProductDto productDto);

	/**
	 * Gets main image.
	 *
	 * @param productId the product
	 *                  id
	 *
	 * @return the main image
	 */
	@PostMapping(value = "/api/product/getMainImage")
	Wrapper<String> getMainImage(@RequestParam("productId") Long productId);
}
