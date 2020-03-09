
package com.cmall.provider.web.rpc;

import com.cmall.core.support.BaseController;
import com.cmall.provider.model.vo.CartVo;
import com.cmall.provider.service.OmcCartQueryFeignApi;
import com.cmall.provider.service.OmcCartService;
import com.cmall.wrapper.WrapMapper;
import com.cmall.wrapper.Wrapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * The class Mall cart query feign client.
 *
 */
@RefreshScope
@RestController
@Api(value = "API - MallCartQueryFeignClient", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class MallCartQueryFeignClient extends BaseController implements OmcCartQueryFeignApi {

	@Resource
	private OmcCartService omcCartService;

	@Override
	@ApiOperation(httpMethod = "POST", value = "获取购物车信息")
	public Wrapper<CartVo> getCartVo(@RequestParam("userId") Long userId) {
		logger.info("getCartVo - 获取购物车信息. userId={}", userId);
		CartVo cartVo = omcCartService.getCarVo(userId);
		return WrapMapper.wrap(Wrapper.SUCCESS_CODE, Wrapper.SUCCESS_MESSAGE, cartVo);
	}
}
