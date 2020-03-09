
package com.cmall.provider.service.hystrix;

import com.github.pagehelper.PageInfo;
import com.cmall.provider.model.dto.ProductCategoryDto;
import com.cmall.provider.model.dto.ProductReqDto;
import com.cmall.provider.service.MdcProductCategoryQueryFeignApi;
import com.cmall.wrapper.Wrapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * The class Mdc product category query feign hystrix.
 *
 */
@Component
public class MdcProductCategoryQueryFeignHystrix implements MdcProductCategoryQueryFeignApi {
	@Override
	public Wrapper<List<ProductCategoryDto>> getProductCategoryData(final Long pid) {
		return null;
	}

	@Override
	public Wrapper<PageInfo> getProductList(final ProductReqDto productReqDto) {
		return null;
	}
}
