package com.finance.base.dao;

import com.finance.base.pojo.FundingNotMatchedEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 待匹配资金表
 * 
 * @author sanzu
 * @email lxf@atguigu.com
 * @date 2020-02-25 16:34:08
 */
@Mapper
public interface FundingNotMatchedDao extends BaseMapper<FundingNotMatchedEntity> {
	
}
