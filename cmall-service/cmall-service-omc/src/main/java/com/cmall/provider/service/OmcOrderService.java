
package com.cmall.provider.service;

import com.github.pagehelper.PageInfo;
import com.cmall.base.dto.BaseQuery;
import com.cmall.base.dto.LoginAuthDto;
import com.cmall.core.support.IService;
import com.cmall.provider.model.domain.OmcOrder;
import com.cmall.provider.model.dto.OrderDto;
import com.cmall.provider.model.dto.OrderPageQuery;
import com.cmall.provider.model.vo.OrderVo;

/**
 * The interface Omc order service.
 *
 */
public interface OmcOrderService extends IService<OmcOrder> {

	/**
	 * 创建订单.
	 *
	 * @param loginAuthDto the login auth dto
	 * @param shippingId   the shipping id
	 *
	 * @return the order vo
	 */
	OrderVo createOrderDoc(LoginAuthDto loginAuthDto, Long shippingId);

	/**
	 * 取消订单.
	 *
	 * @param loginAuthDto the login auth dto
	 * @param orderNo      the order no
	 *
	 * @return the int
	 */
	int cancelOrderDoc(LoginAuthDto loginAuthDto, String orderNo);

	/**
	 * 查询用户订单列表.
	 *
	 * @param userId    the user id
	 * @param baseQuery the base query
	 *
	 * @return the page info
	 */
	PageInfo queryUserOrderListWithPage(Long userId, BaseQuery baseQuery);

	/**
	 * 查询订单状态.
	 *
	 * @param userId  the user id
	 * @param orderNo the order no
	 *
	 * @return the boolean
	 */
	boolean queryOrderPayStatus(Long userId, String orderNo);

	/**
	 * Query by order no omc order.
	 *
	 * @param orderNo the order no
	 *
	 * @return the omc order
	 */
	OmcOrder queryByOrderNo(String orderNo);

	/**
	 * Query by user id and order no omc order.
	 *
	 * @param userId  the user id
	 * @param orderNo the order no
	 *
	 * @return the omc order
	 */
	OmcOrder queryByUserIdAndOrderNo(Long userId, String orderNo);

	/**
	 * 根据订单号查询订单信息.
	 *
	 * @param orderNo the order no
	 *
	 * @return the order dto
	 */
	OrderDto queryOrderDtoByOrderNo(String orderNo);

	/**
	 * 根据订单号查询用户订单信息.
	 *
	 * @param userId  the user id
	 * @param orderNo the order no
	 *
	 * @return the order dto
	 */
	OrderDto queryOrderDtoByUserIdAndOrderNo(Long userId, String orderNo);

	/**
	 * 查询用户订单详情.
	 *
	 * @param userId  the user id
	 * @param orderNo the order no
	 *
	 * @return the order detail
	 */
	OrderVo getOrderDetail(Long userId, String orderNo);

	/**
	 * 查询订单详情.
	 *
	 * @param orderNo the order no
	 *
	 * @return the order detail
	 */
	OrderVo getOrderDetail(String orderNo);

	/**
	 * 分页查询订单列表.
	 *
	 * @param orderPageQuery the order page query
	 *
	 * @return the page info
	 */
	PageInfo queryOrderListWithPage(OrderPageQuery orderPageQuery);
}