
package com.cmall.provider.service;

import com.cmall.core.support.IService;
import com.cmall.provider.model.domain.TpcMqTag;
import com.cmall.provider.model.vo.TpcMqTagVo;

import java.util.List;

/**
 * The interface Tpc mq tag service.
 *
 */
public interface TpcMqTagService extends IService<TpcMqTag> {
	/**
	 * 查询Tag列表.
	 *
	 * @param mdcMqTag the mdc mq tag
	 *
	 * @return the list
	 */
	List<TpcMqTagVo> listWithPage(TpcMqTag mdcMqTag);

	/**
	 * 根据ID删除TAG.
	 *
	 * @param tagId the tag id
	 *
	 * @return the int
	 */
	int deleteTagById(Long tagId);
}
