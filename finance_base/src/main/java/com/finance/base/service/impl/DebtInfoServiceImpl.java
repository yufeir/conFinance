package com.finance.base.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.finance.base.dao.DebtInfoDao;
import com.finance.base.pojo.DebtInfoEntity;
import com.finance.base.service.DebtInfoService;


@Service("debtInfoService")
public class DebtInfoServiceImpl extends ServiceImpl<DebtInfoDao, DebtInfoEntity> implements DebtInfoService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<DebtInfoEntity> page = this.page(
                new Query<DebtInfoEntity>().getPage(params),
                new QueryWrapper<DebtInfoEntity>()
        );

        return new PageVo(page);
    }

}