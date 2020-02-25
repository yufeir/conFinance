package com.finance.base.controller;

import java.util.Arrays;
import java.util.Map;


import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;
import com.atguigu.core.bean.Resp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.finance.base.pojo.AccountLogEntity;
import com.finance.base.service.AccountLogService;




/**
 * 交易流水记录日志
 *
 * @author sanzu
 * @email lxf@atguigu.com
 * @date 2020-02-25 16:34:08
 */
@Api(tags = "交易流水记录日志 管理")
@RestController
@RequestMapping("base/accountlog")
public class AccountLogController {
    @Autowired
    private AccountLogService accountLogService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('base:accountlog:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = accountLogService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{aId}")
    @PreAuthorize("hasAuthority('base:accountlog:info')")
    public Resp<AccountLogEntity> info(@PathVariable("aId") Long aId){
		AccountLogEntity accountLog = accountLogService.getById(aId);

        return Resp.ok(accountLog);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('base:accountlog:save')")
    public Resp<Object> save(@RequestBody AccountLogEntity accountLog){
		accountLogService.save(accountLog);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('base:accountlog:update')")
    public Resp<Object> update(@RequestBody AccountLogEntity accountLog){
		accountLogService.updateById(accountLog);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('base:accountlog:delete')")
    public Resp<Object> delete(@RequestBody Long[] aIds){
		accountLogService.removeByIds(Arrays.asList(aIds));

        return Resp.ok(null);
    }

}
