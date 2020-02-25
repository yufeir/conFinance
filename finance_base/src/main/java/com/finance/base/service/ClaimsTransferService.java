package com.finance.base.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.finance.base.pojo.ClaimsTransferEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 债权转让表
 *
 * @author sanzu
 * @email lxf@atguigu.com
 * @date 2020-02-25 16:52:20
 */
public interface ClaimsTransferService extends IService<ClaimsTransferEntity> {

    PageVo queryPage(QueryCondition params);
}

