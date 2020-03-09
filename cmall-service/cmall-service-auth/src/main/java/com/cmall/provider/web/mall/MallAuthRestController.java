
package com.cmall.provider.web.mall;

import com.github.pagehelper.PageInfo;
import com.cmall.core.support.BaseController;
import com.cmall.provider.model.dto.ProductCategoryDto;
import com.cmall.provider.model.dto.ProductReqDto;
import com.cmall.provider.model.vo.ProductDetailVo;
import com.cmall.provider.service.MdcProductCategoryQueryFeignApi;
import com.cmall.provider.service.MdcProductQueryFeignApi;
import com.cmall.wrapper.Wrapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


/**
 * The class Mall auth rest controller.
 *
 */
@RestController
@RequestMapping(value = "/auth", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@Api(value = "WEB - MallAuthRestController", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class MallAuthRestController extends BaseController {

	@Resource
	private MdcProductQueryFeignApi mdcProductQueryFeignApi;

	@Resource
	private MdcProductCategoryQueryFeignApi mdcProductCategoryQueryFeignApi;

	/**
	 * 查询商品列表.
	 *
	 * @param productReqDto the product req dto
	 *
	 * @return the product category dto by pid
	 */
	@PostMapping(value = "/product/queryProductList")
	@ApiOperation(httpMethod = "POST", value = "查询商品列表")
	public Wrapper<PageInfo> queryProductList(@RequestBody ProductReqDto productReqDto) {
		logger.info("getProductCategoryDtoByPid - 查询分类信息 productReqDto={}", productReqDto);
		return mdcProductCategoryQueryFeignApi.getProductList(productReqDto);
	}

	/**
	 * 查询商品详情信息.
	 *
	 * @param productId the product id
	 *
	 * @return the wrapper
	 */
	@GetMapping(value = "/product/queryProductDetail/{productId}")
	@ApiOperation(httpMethod = "GET", value = "查询商品详情信息")
	public Wrapper<ProductDetailVo> queryProductDetail(@PathVariable Long productId) {
		logger.info("getProductCategoryDtoByPid - 查询商品详情信息 productId={}", productId);
		return mdcProductQueryFeignApi.getProductDetail(productId);
	}

	/**
	 * 查询分类信息.
	 *
	 * @param pid the pid
	 *
	 * @return the product category dto by pid
	 */
	@GetMapping(value = "/category/getProductCategoryDtoByPid/{pid}")
	public Wrapper<List<ProductCategoryDto>> getProductCategoryDtoByPid(@PathVariable Long pid) {
		logger.info("getProductCategoryDtoByPid - 查询分类信息 pid={}", pid);
		Wrapper<List<ProductCategoryDto>> productCategoryData = mdcProductCategoryQueryFeignApi.getProductCategoryData(pid);
		logger.info("productCategoryData={}", productCategoryData);
		return productCategoryData;
	}
}
