
package com.cmall.provider.mapper;

import com.cmall.core.mybatis.MyMapper;
import com.cmall.provider.model.domain.TpcMqSubscribeTag;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * The interface Tpc mq subscribe tag mapper.
 *
 */
@Mapper
@Component
public interface TpcMqSubscribeTagMapper extends MyMapper<TpcMqSubscribeTag> {
}