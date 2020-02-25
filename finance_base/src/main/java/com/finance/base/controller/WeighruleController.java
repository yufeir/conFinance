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

import com.finance.base.pojo.WeighruleEntity;
import com.finance.base.service.WeighruleService;




/**
 * 权重规则表
 *
 * @author sanzu
 * @email lxf@atguigu.com
 * @date 2020-02-25 16:33:58
 */
@Api(tags = "权重规则表 管理")
@RestController
@RequestMapping("base/weighrule")
public class WeighruleController {
    @Autowired
    private WeighruleService weighruleService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('base:weighrule:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = weighruleService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{tId}")
    @PreAuthorize("hasAuthority('base:weighrule:info')")
    public Resp<WeighruleEntity> info(@PathVariable("tId") Long tId){
		WeighruleEntity weighrule = weighruleService.getById(tId);

        return Resp.ok(weighrule);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('base:weighrule:save')")
    public Resp<Object> save(@RequestBody WeighruleEntity weighrule){
		weighruleService.save(weighrule);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('base:weighrule:update')")
    public Resp<Object> update(@RequestBody WeighruleEntity weighrule){
		weighruleService.updateById(weighrule);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('base:weighrule:delete')")
    public Resp<Object> delete(@RequestBody Long[] tIds){
		weighruleService.removeByIds(Arrays.asList(tIds));

        return Resp.ok(null);
    }

}
