package com.finance.base.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.finance.base.pojo.ExpectedReturnEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 预期收益表
 *
 * @author sanzu
 * @email lxf@atguigu.com
 * @date 2020-02-25 16:34:08
 */
public interface ExpectedReturnService extends IService<ExpectedReturnEntity> {

    PageVo queryPage(QueryCondition params);
}

