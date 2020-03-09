
package com.cmall.provider.mapper;

import com.cmall.core.mybatis.MyMapper;
import com.cmall.provider.model.domain.TpcJobTask;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * The interface Tpc job task mapper.
 *
 */
@Mapper
@Component
public interface TpcJobTaskMapper extends MyMapper<TpcJobTask> {
}