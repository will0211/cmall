
package com.cmall.provider.service.hystrix;

import com.cmall.provider.model.dto.ProductDto;
import com.cmall.provider.service.MdcProductFeignApi;
import com.cmall.wrapper.Wrapper;
import org.springframework.stereotype.Component;

/**
 * The class Mdc product feign hystrix.
 *
 */
@Component
public class MdcProductFeignHystrix implements MdcProductFeignApi {

	@Override
	public Wrapper<Integer> updateProductStockById(final ProductDto productDto) {
		return null;
	}

	@Override
	public Wrapper<String> getMainImage(final Long productId) {
		return null;
	}
}
