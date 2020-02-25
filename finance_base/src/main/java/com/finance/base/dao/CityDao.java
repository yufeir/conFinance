package com.finance.base.dao;

import com.finance.base.pojo.CityEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 城市表
 * 
 * @author sanzu
 * @email lxf@atguigu.com
 * @date 2020-02-25 16:33:59
 */
@Mapper
public interface CityDao extends BaseMapper<CityEntity> {
	
}
