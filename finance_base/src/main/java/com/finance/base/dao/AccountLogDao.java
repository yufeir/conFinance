package com.finance.base.dao;

import com.finance.base.pojo.AccountLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 交易流水记录日志
 * 
 * @author sanzu
 * @email lxf@atguigu.com
 * @date 2020-02-25 16:34:08
 */
@Mapper
public interface AccountLogDao extends BaseMapper<AccountLogEntity> {
	
}
