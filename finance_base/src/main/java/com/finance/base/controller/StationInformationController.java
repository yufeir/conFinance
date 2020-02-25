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

import com.finance.base.pojo.StationInformationEntity;
import com.finance.base.service.StationInformationService;




/**
 * 站内信息
 *
 * @author sanzu
 * @email lxf@atguigu.com
 * @date 2020-02-25 16:33:59
 */
@Api(tags = "站内信息 管理")
@RestController
@RequestMapping("base/stationinformation")
public class StationInformationController {
    @Autowired
    private StationInformationService stationInformationService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('base:stationinformation:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = stationInformationService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{sId}")
    @PreAuthorize("hasAuthority('base:stationinformation:info')")
    public Resp<StationInformationEntity> info(@PathVariable("sId") Long sId){
		StationInformationEntity stationInformation = stationInformationService.getById(sId);

        return Resp.ok(stationInformation);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('base:stationinformation:save')")
    public Resp<Object> save(@RequestBody StationInformationEntity stationInformation){
		stationInformationService.save(stationInformation);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('base:stationinformation:update')")
    public Resp<Object> update(@RequestBody StationInformationEntity stationInformation){
		stationInformationService.updateById(stationInformation);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('base:stationinformation:delete')")
    public Resp<Object> delete(@RequestBody Long[] sIds){
		stationInformationService.removeByIds(Arrays.asList(sIds));

        return Resp.ok(null);
    }

}
