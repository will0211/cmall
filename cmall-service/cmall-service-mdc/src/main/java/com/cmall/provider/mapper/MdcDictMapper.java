
package com.cmall.provider.mapper;

import com.cmall.core.mybatis.MyMapper;
import com.cmall.provider.model.domain.MdcDict;
import com.cmall.provider.model.vo.MdcDictVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * The interface Mdc dict mapper.
 *
 */
@Mapper
@Component
public interface MdcDictMapper extends MyMapper<MdcDict> {
	/**
	 * List dict vo list.
	 *
	 * @return the list
	 */
	List<MdcDictVo> listDictVo();
}