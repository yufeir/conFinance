package com.finance.base.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.finance.base.dao.BankcardDao;
import com.finance.base.pojo.BankcardEntity;
import com.finance.base.service.BankcardService;


@Service("bankcardService")
public class BankcardServiceImpl extends ServiceImpl<BankcardDao, BankcardEntity> implements BankcardService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<BankcardEntity> page = this.page(
                new Query<BankcardEntity>().getPage(params),
                new QueryWrapper<BankcardEntity>()
        );

        return new PageVo(page);
    }

}