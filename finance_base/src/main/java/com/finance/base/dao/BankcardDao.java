package com.finance.base.dao;

import com.finance.base.pojo.BankcardEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 银行卡表
 * 
 * @author sanzu
 * @email lxf@atguigu.com
 * @date 2020-02-25 16:34:08
 */
@Mapper
public interface BankcardDao extends BaseMapper<BankcardEntity> {
	
}
