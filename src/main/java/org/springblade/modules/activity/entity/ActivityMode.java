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
package org.springblade.modules.activity.entity;

import com.baomidou.mybatisplus.annotation.IdType;

import java.time.LocalDate;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import java.time.LocalDateTime;
import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springblade.core.mp.base.BaseEntity;

/**
 * 实体类
 *
 * @author BladeX
 * @since 2022-04-08
 */
@Data
@ApiModel(value = "ActivityMode对象", description = "ActivityMode对象")
public class ActivityMode extends BaseEntity {

	private static final long serialVersionUID = 1L;

	/**
	 * 模版名称
	 */
	@ApiModelProperty(value = "模版名称")
	private String name;
	/**
	 * 活动名称
	 */
	@ApiModelProperty(value = "活动名称")
	private String activityName;
	/**
	 * 活动地点
	 */
	@ApiModelProperty(value = "活动地点")
	private String address;
	/**
	 * 活动时间
	 */
	@ApiModelProperty(value = "活动时间")
	private LocalDate activityTime;
	/**
	 * 活动描述
	 */
	@ApiModelProperty(value = "活动描述")
	private String activityDescription;
	/**
	 * 活动原因
	 */
	@ApiModelProperty(value = "活动原因")
	private String activityCase;


	@TableField(exist = false)
	private Long createDept;

}
