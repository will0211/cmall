
package com.cmall.provider.service.hystrix;

import com.cmall.provider.model.dto.ProductDto;
import com.cmall.provider.model.vo.ProductDetailVo;
import com.cmall.provider.service.MdcProductQueryFeignApi;
import com.cmall.wrapper.Wrapper;
import org.springframework.stereotype.Component;

/**
 * The class Mdc product query feign hystrix.
 *
 */
@Component
public class MdcProductQueryFeignHystrix implements MdcProductQueryFeignApi {

	@Override
	public Wrapper<ProductDetailVo> getProductDetail(final Long productId) {
		return null;
	}

	@Override
	public Wrapper<ProductDto> selectById(final Long productId) {
		return null;
	}
}
