package com.finance.base.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.additional.query.impl.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.additional.query.impl.QueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.additional.update.impl.LambdaUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.service.additional.update.impl.UpdateChainWrapper;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.finance.base.dao.FundingNotMatchedDao;
import com.finance.base.pojo.FundingNotMatchedEntity;
import com.finance.base.service.FundingNotMatchedService;


@Service("fundingNotMatchedService")
public class FundingNotMatchedServiceImpl extends ServiceImpl<FundingNotMatchedDao, FundingNotMatchedEntity> implements FundingNotMatchedService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<FundingNotMatchedEntity> page = this.page(
                new Query<FundingNotMatchedEntity>().getPage(params),
                new QueryWrapper<FundingNotMatchedEntity>()
        );

        return new PageVo(page);
    }


}