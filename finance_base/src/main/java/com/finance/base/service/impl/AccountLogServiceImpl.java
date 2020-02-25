package com.finance.base.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.finance.base.dao.AccountLogDao;
import com.finance.base.pojo.AccountLogEntity;
import com.finance.base.service.AccountLogService;


@Service("accountLogService")
public class AccountLogServiceImpl extends ServiceImpl<AccountLogDao, AccountLogEntity> implements AccountLogService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<AccountLogEntity> page = this.page(
                new Query<AccountLogEntity>().getPage(params),
                new QueryWrapper<AccountLogEntity>()
        );

        return new PageVo(page);
    }

}