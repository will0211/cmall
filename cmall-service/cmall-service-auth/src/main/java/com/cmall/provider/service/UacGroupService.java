
package com.cmall.provider.service;



import com.cmall.base.dto.LoginAuthDto;
import com.cmall.core.support.IService;
import com.cmall.provider.model.entity.UacGroup;
import com.cmall.provider.model.dto.group.GroupBindUserDto;
import com.cmall.provider.model.dto.group.GroupBindUserReqDto;
import com.cmall.provider.model.dto.user.IdStatusDto;
import com.cmall.provider.model.vo.GroupZtreeVo;
import com.cmall.provider.model.vo.MenuVo;

import java.util.List;

/**
 * The interface Uac group service.
 *
 */
public interface UacGroupService extends IService<UacGroup> {

	/**
	 * Update uac group status by id int.
	 *
	 * @param idStatusDto  the id status dto
	 * @param loginAuthDto the login auth dto
	 *
	 * @return the int
	 */
	int updateUacGroupStatusById(IdStatusDto idStatusDto, LoginAuthDto loginAuthDto);

	/**
	 * Delete uac group by id int.
	 *
	 * @param id the id
	 *
	 * @return the int
	 */
	int deleteUacGroupById(Long id);

	/**
	 * Query by id uac group.
	 *
	 * @param groupId the group id
	 *
	 * @return the uac group
	 */
	UacGroup queryById(Long groupId);

	/**
	 * Gets group tree.
	 *
	 * @param id the id
	 *
	 * @return the group tree
	 */
	List<GroupZtreeVo> getGroupTree(Long id);

	/**
	 * Find current user have group info list.
	 *
	 * @param userId the user id
	 *
	 * @return the list
	 */
	List<MenuVo> getGroupTreeListByUserId(Long userId);

	/**
	 * Gets group bind user dto.
	 *
	 * @param groupId the group id
	 * @param userId  the user id
	 *
	 * @return the group bind user dto
	 */
	GroupBindUserDto getGroupBindUserDto(Long groupId, Long userId);

	/**
	 * Bind uac user 4 group int.
	 *
	 * @param groupBindUserReqDto the group bind user req dto
	 * @param loginAuthDto        the login auth dto
	 */
	void bindUacUser4Group(GroupBindUserReqDto groupBindUserReqDto, LoginAuthDto loginAuthDto);

	/**
	 * Save uac group int.
	 *
	 * @param group        the group
	 * @param loginAuthDto the login auth dto
	 *
	 * @return the int
	 */
	int saveUacGroup(UacGroup group, LoginAuthDto loginAuthDto);

	/**
	 * Gets by id.
	 *
	 * @param id the id
	 *
	 * @return the by id
	 */
	UacGroup getById(Long id);
}
