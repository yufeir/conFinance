package com.finance.base.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.finance.base.dao.CityDao;
import com.finance.base.pojo.CityEntity;
import com.finance.base.service.CityService;


@Service("cityService")
public class CityServiceImpl extends ServiceImpl<CityDao, CityEntity> implements CityService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<CityEntity> page = this.page(
                new Query<CityEntity>().getPage(params),
                new QueryWrapper<CityEntity>()
        );

        return new PageVo(page);
    }

}