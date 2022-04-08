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
import org.springblade.modules.activity.entity.ActivityUser;
import org.springblade.modules.activity.vo.ActivityUserVO;
import org.springblade.modules.activity.service.IActivityUserService;
import org.springblade.core.boot.ctrl.BladeController;

/**
 *  控制器
 *
 * @author BladeX
 * @since 2022-04-08
 */
@RestController
@AllArgsConstructor
@RequestMapping("blade-activity/activityuser")
@Api(value = "", tags = "接口")
public class ActivityUserController extends BladeController {

	private final IActivityUserService activityUserService;

	/**
	 * 详情
	 */
	@GetMapping("/detail")
	@ApiOperationSupport(order = 1)
	@ApiOperation(value = "详情", notes = "传入activityUser")
	public R<ActivityUser> detail(ActivityUser activityUser) {
		ActivityUser detail = activityUserService.getOne(Condition.getQueryWrapper(activityUser));
		return R.data(detail);
	}

	/**
	 * 分页 
	 */
	@GetMapping("/list")
	@ApiOperationSupport(order = 2)
	@ApiOperation(value = "分页", notes = "传入activityUser")
	public R<IPage<ActivityUser>> list(ActivityUser activityUser, Query query) {
		IPage<ActivityUser> pages = activityUserService.page(Condition.getPage(query), Condition.getQueryWrapper(activityUser));
		return R.data(pages);
	}

	/**
	 * 自定义分页 
	 */
	@GetMapping("/page")
	@ApiOperationSupport(order = 3)
	@ApiOperation(value = "分页", notes = "传入activityUser")
	public R<IPage<ActivityUserVO>> page(ActivityUserVO activityUser, Query query) {
		IPage<ActivityUserVO> pages = activityUserService.selectActivityUserPage(Condition.getPage(query), activityUser);
		return R.data(pages);
	}

	/**
	 * 新增 
	 */
	@PostMapping("/save")
	@ApiOperationSupport(order = 4)
	@ApiOperation(value = "新增", notes = "传入activityUser")
	public R save(@Valid @RequestBody ActivityUser activityUser) {
		return R.status(activityUserService.save(activityUser));
	}

	/**
	 * 修改 
	 */
	@PostMapping("/update")
	@ApiOperationSupport(order = 5)
	@ApiOperation(value = "修改", notes = "传入activityUser")
	public R update(@Valid @RequestBody ActivityUser activityUser) {
		return R.status(activityUserService.updateById(activityUser));
	}

	/**
	 * 新增或修改 
	 */
	@PostMapping("/submit")
	@ApiOperationSupport(order = 6)
	@ApiOperation(value = "新增或修改", notes = "传入activityUser")
	public R submit(@Valid @RequestBody ActivityUser activityUser) {
		return R.status(activityUserService.saveOrUpdate(activityUser));
	}

	
	/**
	 * 删除 
	 */
	@PostMapping("/remove")
	@ApiOperationSupport(order = 8)
	@ApiOperation(value = "删除", notes = "传入ids")
	public R remove(@ApiParam(value = "主键集合", required = true) @RequestParam String ids) {
		return R.status(activityUserService.removeByIds(Func.toLongList(ids)));
	}

	
}