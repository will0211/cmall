
package com.cmall.provider.web.rpc;

import com.cmall.PublicUtil;
import com.cmall.core.support.BaseController;
import com.cmall.provider.model.domain.MdcAddress;
import com.cmall.provider.model.dto.AddressDTO;
import com.cmall.provider.service.MdcAddressQueryFeignApi;
import com.cmall.provider.service.MdcAddressService;
import com.cmall.wrapper.WrapMapper;
import com.cmall.wrapper.Wrapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * The class Mdc product query feign client.
 *
 */
@RefreshScope
@RestController
@Api(value = "API - MdcAddressQueryFeignClient", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class MdcAddressQueryFeignClient extends BaseController implements MdcAddressQueryFeignApi {

	@Resource
	private MdcAddressService mdcAddressService;

	/**
	 * 根据ID获取地址信息.
	 *
	 * @param addressId the address id
	 *
	 * @return the by id
	 */
	@Override
	@ApiOperation(httpMethod = "POST", value = "根据ID获取地址信息")
	public Wrapper<AddressDTO> getById(@PathVariable("addressId") Long addressId) {
		logger.info("根据ID获取地址信息 addressId={}", addressId);
		AddressDTO addressDTO = null;
		MdcAddress mdcAddress = mdcAddressService.selectByKey(addressId);
		if (PublicUtil.isNotEmpty(mdcAddress)) {
			addressDTO = new AddressDTO();
			BeanUtils.copyProperties(mdcAddress, addressDTO);
		}
		return WrapMapper.ok(addressDTO);
	}
}
