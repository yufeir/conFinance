package com.finance.base.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.finance.base.pojo.ProductEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 理财产品表
 *
 * @author sanzu
 * @email lxf@atguigu.com
 * @date 2020-02-25 16:33:59
 */
public interface ProductService extends IService<ProductEntity> {

    PageVo queryPage(QueryCondition params);
}

