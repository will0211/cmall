
package com.cmall.provider.service;

import com.cmall.core.support.IService;
import com.cmall.provider.model.domain.TpcMqTopic;
import com.cmall.provider.model.vo.TpcMqTopicVo;

import java.util.List;

/**
 * The interface Tpc mq topic service.
 *
 */
public interface TpcMqTopicService extends IService<TpcMqTopic> {
	/**
	 * 查询MQ topic列表.
	 *
	 * @param mdcMqTopic the mdc mq topic
	 *
	 * @return the list
	 */
	List<TpcMqTopicVo> listWithPage(TpcMqTopic mdcMqTopic);

}
