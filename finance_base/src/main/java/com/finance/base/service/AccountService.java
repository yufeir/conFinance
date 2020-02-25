package com.finance.base.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.finance.base.pojo.AccountEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 用户帐户表
 *
 * @author sanzu
 * @email lxf@atguigu.com
 * @date 2020-02-25 16:34:08
 */
public interface AccountService extends IService<AccountEntity> {

    PageVo queryPage(QueryCondition params);
}

