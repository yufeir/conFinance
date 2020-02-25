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

import com.finance.base.pojo.MatchedResultEntity;
import com.finance.base.service.MatchedResultService;




/**
 * 匹配结果表
 *
 * @author sanzu
 * @email lxf@atguigu.com
 * @date 2020-02-25 16:33:59
 */
@Api(tags = "匹配结果表 管理")
@RestController
@RequestMapping("base/matchedresult")
public class MatchedResultController {
    @Autowired
    private MatchedResultService matchedResultService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('base:matchedresult:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = matchedResultService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{iId}")
    @PreAuthorize("hasAuthority('base:matchedresult:info')")
    public Resp<MatchedResultEntity> info(@PathVariable("iId") Long iId){
		MatchedResultEntity matchedResult = matchedResultService.getById(iId);

        return Resp.ok(matchedResult);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('base:matchedresult:save')")
    public Resp<Object> save(@RequestBody MatchedResultEntity matchedResult){
		matchedResultService.save(matchedResult);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('base:matchedresult:update')")
    public Resp<Object> update(@RequestBody MatchedResultEntity matchedResult){
		matchedResultService.updateById(matchedResult);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('base:matchedresult:delete')")
    public Resp<Object> delete(@RequestBody Long[] iIds){
		matchedResultService.removeByIds(Arrays.asList(iIds));

        return Resp.ok(null);
    }

}
