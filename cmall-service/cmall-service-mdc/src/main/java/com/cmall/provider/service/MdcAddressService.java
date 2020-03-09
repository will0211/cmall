
package com.cmall.provider.service;


import com.cmall.TreeNode;
import com.cmall.core.support.IService;
import com.cmall.provider.model.domain.MdcAddress;

import java.util.List;

/**
 * The interface Mdc address service.
 *
 */
public interface MdcAddressService extends IService<MdcAddress> {
	/**
	 * 根据PID查询地址信息
	 *
	 * @param pid the pid
	 *
	 * @return the list
	 */
	List<MdcAddress> listByPid(Long pid);

	/**
	 * Gets by id.
	 *
	 * @param id the id
	 *
	 * @return the by id
	 */
	MdcAddress getById(Long id);

	/**
	 * Gets 4 city.
	 *
	 * @return the 4 city
	 */
	List<TreeNode> get4City();
}
