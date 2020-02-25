package com.finance.base.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.finance.base.pojo.UndertakerEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 手续费表
 *
 * @author sanzu
 * @email lxf@atguigu.com
 * @date 2020-02-25 16:33:58
 */
public interface UndertakerService extends IService<UndertakerEntity> {

    PageVo queryPage(QueryCondition params);
}

