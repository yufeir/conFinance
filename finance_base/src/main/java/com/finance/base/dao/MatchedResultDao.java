package com.finance.base.dao;

import com.finance.base.pojo.MatchedResultEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 匹配结果表
 * 
 * @author sanzu
 * @email lxf@atguigu.com
 * @date 2020-02-25 16:33:59
 */
@Mapper
public interface MatchedResultDao extends BaseMapper<MatchedResultEntity> {
	
}
