package com.finance.base.dao;

import com.finance.base.pojo.DebtorRecordEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 债权还款记录实体类
 * 
 * @author sanzu
 * @email lxf@atguigu.com
 * @date 2020-02-25 16:34:08
 */
@Mapper
public interface DebtorRecordDao extends BaseMapper<DebtorRecordEntity> {
	
}
