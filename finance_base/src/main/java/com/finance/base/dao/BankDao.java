package com.finance.base.dao;

import com.finance.base.pojo.BankEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 银行表
 * 
 * @author sanzu
 * @email lxf@atguigu.com
 * @date 2020-02-25 16:34:08
 */
@Mapper
public interface BankDao extends BaseMapper<BankEntity> {
	
}
