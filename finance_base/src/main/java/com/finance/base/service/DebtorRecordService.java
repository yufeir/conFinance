package com.finance.base.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.finance.base.pojo.DebtorRecordEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 债权还款记录实体类
 *
 * @author sanzu
 * @email lxf@atguigu.com
 * @date 2020-02-25 16:34:08
 */
public interface DebtorRecordService extends IService<DebtorRecordEntity> {

    PageVo queryPage(QueryCondition params);
}

