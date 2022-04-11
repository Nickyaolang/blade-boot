/*
 *      Copyright (c) 2018-2028, Chill Zhuang All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions are met:
 *
 *  Redistributions of source code must retain the above copyright notice,
 *  this list of conditions and the following disclaimer.
 *  Redistributions in binary form must reproduce the above copyright
 *  notice, this list of conditions and the following disclaimer in the
 *  documentation and/or other materials provided with the distribution.
 *  Neither the name of the dreamlu.net developer nor the names of its
 *  contributors may be used to endorse or promote products derived from
 *  this software without specific prior written permission.
 *  Author: Chill 庄骞 (smallchill@163.com)
 */
package org.springblade.modules.activity.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import lombok.AllArgsConstructor;
import javax.validation.Valid;

import org.springblade.core.mp.support.Condition;
import org.springblade.core.mp.support.Query;
import org.springblade.core.tool.api.R;
import org.springblade.core.tool.utils.Func;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springblade.modules.activity.entity.ActivityEvaluate;
import org.springblade.modules.activity.vo.ActivityEvaluateVO;
import org.springblade.modules.activity.service.IActivityEvaluateService;
import org.springblade.core.boot.ctrl.BladeController;

/**
 *  控制器
 *
 * @author BladeX
 * @since 2022-04-11
 */
@RestController
@AllArgsConstructor
@RequestMapping("blade-activity/activityevaluate")
@Api(value = "", tags = "接口")
public class ActivityEvaluateController extends BladeController {

	private final IActivityEvaluateService activityEvaluateService;

	/**
	 * 详情
	 */
	@GetMapping("/detail")
	@ApiOperationSupport(order = 1)
	@ApiOperation(value = "详情", notes = "传入activityEvaluate")
	public R<ActivityEvaluate> detail(ActivityEvaluate activityEvaluate) {
		ActivityEvaluate detail = activityEvaluateService.getOne(Condition.getQueryWrapper(activityEvaluate));
		return R.data(detail);
	}

	/**
	 * 分页 
	 */
	@GetMapping("/list")
	@ApiOperationSupport(order = 2)
	@ApiOperation(value = "分页", notes = "传入activityEvaluate")
	public R<IPage<ActivityEvaluate>> list(ActivityEvaluate activityEvaluate, Query query) {
		IPage<ActivityEvaluate> pages = activityEvaluateService.page(Condition.getPage(query), Condition.getQueryWrapper(activityEvaluate));
		return R.data(pages);
	}

	/**
	 * 自定义分页 
	 */
	@GetMapping("/page")
	@ApiOperationSupport(order = 3)
	@ApiOperation(value = "分页", notes = "传入activityEvaluate")
	public R<IPage<ActivityEvaluateVO>> page(ActivityEvaluateVO activityEvaluate, Query query) {
		IPage<ActivityEvaluateVO> pages = activityEvaluateService.selectActivityEvaluatePage(Condition.getPage(query), activityEvaluate);
		return R.data(pages);
	}

	/**
	 * 新增 
	 */
	@PostMapping("/save")
	@ApiOperationSupport(order = 4)
	@ApiOperation(value = "新增", notes = "传入activityEvaluate")
	public R save(@Valid @RequestBody ActivityEvaluate activityEvaluate) {
		return R.status(activityEvaluateService.save(activityEvaluate));
	}

	/**
	 * 修改 
	 */
	@PostMapping("/update")
	@ApiOperationSupport(order = 5)
	@ApiOperation(value = "修改", notes = "传入activityEvaluate")
	public R update(@Valid @RequestBody ActivityEvaluate activityEvaluate) {
		return R.status(activityEvaluateService.updateById(activityEvaluate));
	}

	/**
	 * 新增或修改 
	 */
	@PostMapping("/submit")
	@ApiOperationSupport(order = 6)
	@ApiOperation(value = "新增或修改", notes = "传入activityEvaluate")
	public R submit(@Valid @RequestBody ActivityEvaluate activityEvaluate) {
		return R.status(activityEvaluateService.saveOrUpdate(activityEvaluate));
	}

	
	/**
	 * 删除 
	 */
	@PostMapping("/remove")
	@ApiOperationSupport(order = 8)
	@ApiOperation(value = "删除", notes = "传入ids")
	public R remove(@ApiParam(value = "主键集合", required = true) @RequestParam String ids) {
		return R.status(activityEvaluateService.removeByIds(Func.toLongList(ids)));
	}

	
}
