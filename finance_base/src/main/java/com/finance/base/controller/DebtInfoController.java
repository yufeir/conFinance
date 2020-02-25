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

import com.finance.base.pojo.DebtInfoEntity;
import com.finance.base.service.DebtInfoService;




/**
 * 债权表
 *
 * @author sanzu
 * @email lxf@atguigu.com
 * @date 2020-02-25 16:34:08
 */
@Api(tags = "债权表 管理")
@RestController
@RequestMapping("base/debtinfo")
public class DebtInfoController {
    @Autowired
    private DebtInfoService debtInfoService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('base:debtinfo:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = debtInfoService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{dId}")
    @PreAuthorize("hasAuthority('base:debtinfo:info')")
    public Resp<DebtInfoEntity> info(@PathVariable("dId") Long dId){
		DebtInfoEntity debtInfo = debtInfoService.getById(dId);

        return Resp.ok(debtInfo);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('base:debtinfo:save')")
    public Resp<Object> save(@RequestBody DebtInfoEntity debtInfo){
		debtInfoService.save(debtInfo);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('base:debtinfo:update')")
    public Resp<Object> update(@RequestBody DebtInfoEntity debtInfo){
		debtInfoService.updateById(debtInfo);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('base:debtinfo:delete')")
    public Resp<Object> delete(@RequestBody Long[] dIds){
		debtInfoService.removeByIds(Arrays.asList(dIds));

        return Resp.ok(null);
    }

}
