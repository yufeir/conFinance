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

import com.finance.base.pojo.FundingNotMatchedEntity;
import com.finance.base.service.FundingNotMatchedService;




/**
 * 待匹配资金表
 *
 * @author sanzu
 * @email lxf@atguigu.com
 * @date 2020-02-25 16:34:08
 */
@Api(tags = "待匹配资金表 管理")
@RestController
@RequestMapping("base/fundingnotmatched")
public class FundingNotMatchedController {
    @Autowired
    private FundingNotMatchedService fundingNotMatchedService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('base:fundingnotmatched:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = fundingNotMatchedService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{fId}")
    @PreAuthorize("hasAuthority('base:fundingnotmatched:info')")
    public Resp<FundingNotMatchedEntity> info(@PathVariable("fId") Long fId){
		FundingNotMatchedEntity fundingNotMatched = fundingNotMatchedService.getById(fId);

        return Resp.ok(fundingNotMatched);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('base:fundingnotmatched:save')")
    public Resp<Object> save(@RequestBody FundingNotMatchedEntity fundingNotMatched){
		fundingNotMatchedService.save(fundingNotMatched);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('base:fundingnotmatched:update')")
    public Resp<Object> update(@RequestBody FundingNotMatchedEntity fundingNotMatched){
		fundingNotMatchedService.updateById(fundingNotMatched);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('base:fundingnotmatched:delete')")
    public Resp<Object> delete(@RequestBody Long[] fIds){
		fundingNotMatchedService.removeByIds(Arrays.asList(fIds));

        return Resp.ok(null);
    }

}
