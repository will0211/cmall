
package com.cmall.provider.manager;

import com.cmall.base.enums.ErrorCodeEnum;
import com.cmall.provider.annotation.MqProducerStore;
import com.cmall.provider.exceptions.MdcBizException;
import com.cmall.provider.mapper.MdcProductMapper;
import com.cmall.provider.model.domain.MdcProduct;
import com.cmall.provider.model.entity.MqMessageData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * The class User manager.
 *
 */
@Slf4j
@Component
@Transactional(rollbackFor = Exception.class)
public class MdcProductManager {
	@Resource
	private MdcProductMapper mdcProductMapper;

	/**
	 * Save product.
	 *
	 * @param mqMessageData the mq message data
	 * @param product       the product
	 * @param addFlag       the add flag
	 */
	@MqProducerStore
	public void saveProduct(final MqMessageData mqMessageData, final MdcProduct product, boolean addFlag) {
		log.info("保存商品信息. mqMessageData={}, product={}", mqMessageData, product);
		if (addFlag) {
			mdcProductMapper.insertSelective(product);
		} else {
			int result = mdcProductMapper.updateByPrimaryKeySelective(product);
			if (result < 1) {
				throw new MdcBizException(ErrorCodeEnum.MDC10021022, product.getId());
			}
		}
	}

	/**
	 * Delete product.
	 *
	 * @param mqMessageData the mq message data
	 * @param productId     the product id
	 */
	@MqProducerStore
	public void deleteProduct(final MqMessageData mqMessageData, final Long productId) {
		log.info("删除商品信息. mqMessageData={}, productId={}", mqMessageData, productId);
		int result = mdcProductMapper.deleteByPrimaryKey(productId);
		if (result < 1) {
			throw new MdcBizException(ErrorCodeEnum.MDC10021023, productId);
		}
	}
}
