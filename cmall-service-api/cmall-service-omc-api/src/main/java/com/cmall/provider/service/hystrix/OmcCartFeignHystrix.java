
package com.cmall.provider.service.hystrix;

import com.cmall.provider.model.vo.CartProductVo;
import com.cmall.provider.service.OmcCartFeignApi;
import com.cmall.wrapper.Wrapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * The class Omc cart feign hystrix.
 *
 */
@Component
public class OmcCartFeignHystrix implements OmcCartFeignApi {
	@Override
	public Wrapper updateCartList(final List<CartProductVo> cartProductVoList) {
		return null;
	}

	@Override
	public Wrapper addProduct(final Long userId, final Long productId, final Integer count) {
		return null;
	}

	@Override
	public Wrapper updateProduct(final Long userId, final Long productId, final Integer count) {
		return null;
	}

	@Override
	public Wrapper deleteProduct(final Long userId, final String productIds) {
		return null;
	}

	@Override
	public Wrapper selectOrUnSelect(final Long userId, final Long productId, final Integer checked) {
		return null;
	}
}
