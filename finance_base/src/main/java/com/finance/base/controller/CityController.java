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

import com.finance.base.pojo.CityEntity;
import com.finance.base.service.CityService;




/**
 * 城市表
 *
 * @author sanzu
 * @email lxf@atguigu.com
 * @date 2020-02-25 16:33:59
 */
@Api(tags = "城市表 管理")
@RestController
@RequestMapping("base/city")
public class CityController {
    @Autowired
    private CityService cityService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('base:city:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = cityService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{tId}")
    @PreAuthorize("hasAuthority('base:city:info')")
    public Resp<CityEntity> info(@PathVariable("tId") Long tId){
		CityEntity city = cityService.getById(tId);

        return Resp.ok(city);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('base:city:save')")
    public Resp<Object> save(@RequestBody CityEntity city){
		cityService.save(city);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('base:city:update')")
    public Resp<Object> update(@RequestBody CityEntity city){
		cityService.updateById(city);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('base:city:delete')")
    public Resp<Object> delete(@RequestBody Long[] tIds){
		cityService.removeByIds(Arrays.asList(tIds));

        return Resp.ok(null);
    }

}
