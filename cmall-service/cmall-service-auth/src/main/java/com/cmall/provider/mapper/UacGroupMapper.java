
package com.cmall.provider.mapper;

import com.cmall.core.mybatis.MyMapper;
import com.cmall.provider.model.entity.UacGroup;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * The interface Uac group mapper.
 *
 */
@Mapper
@Component
public interface UacGroupMapper extends MyMapper<UacGroup> {
}