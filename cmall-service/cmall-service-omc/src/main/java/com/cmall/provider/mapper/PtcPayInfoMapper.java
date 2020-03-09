
package com.cmall.provider.mapper;

import com.cmall.core.mybatis.MyMapper;
import com.cmall.provider.model.domain.PtcPayInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * The interface Ptc pay info mapper.
 *
 */
@Mapper
@Component
public interface PtcPayInfoMapper extends MyMapper<PtcPayInfo> {
}