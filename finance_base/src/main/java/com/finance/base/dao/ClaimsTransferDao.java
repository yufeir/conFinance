package com.finance.base.dao;

import com.finance.base.pojo.ClaimsTransferEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 债权转让表
 * 
 * @author sanzu
 * @email lxf@atguigu.com
 * @date 2020-02-25 16:52:20
 */
@Mapper
public interface ClaimsTransferDao extends BaseMapper<ClaimsTransferEntity> {
	
}
