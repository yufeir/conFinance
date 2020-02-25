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

import com.finance.base.pojo.BankEntity;
import com.finance.base.service.BankService;




/**
 * 银行表
 *
 * @author sanzu
 * @email lxf@atguigu.com
 * @date 2020-02-25 16:34:08
 */
@Api(tags = "银行表 管理")
@RestController
@RequestMapping("base/bank")
public class BankController {
    @Autowired
    private BankService bankService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('base:bank:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = bankService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{tId}")
    @PreAuthorize("hasAuthority('base:bank:info')")
    public Resp<BankEntity> info(@PathVariable("tId") Long tId){
		BankEntity bank = bankService.getById(tId);

        return Resp.ok(bank);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('base:bank:save')")
    public Resp<Object> save(@RequestBody BankEntity bank){
		bankService.save(bank);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('base:bank:update')")
    public Resp<Object> update(@RequestBody BankEntity bank){
		bankService.updateById(bank);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('base:bank:delete')")
    public Resp<Object> delete(@RequestBody Long[] tIds){
		bankService.removeByIds(Arrays.asList(tIds));

        return Resp.ok(null);
    }

}
