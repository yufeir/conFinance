package com.finance.base.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.finance.base.dao.ProductDao;
import com.finance.base.pojo.ProductEntity;
import com.finance.base.service.ProductService;


@Service("productService")
public class ProductServiceImpl extends ServiceImpl<ProductDao, ProductEntity> implements ProductService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<ProductEntity> page = this.page(
                new Query<ProductEntity>().getPage(params),
                new QueryWrapper<ProductEntity>()
        );

        return new PageVo(page);
    }

}