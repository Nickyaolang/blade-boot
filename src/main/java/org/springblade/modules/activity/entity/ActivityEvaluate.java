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

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 实体类
 *
 * @author BladeX
 * @since 2022-04-11
 */
@Data
@ApiModel(value = "ActivityEvaluate对象", description = "ActivityEvaluate对象")
public class ActivityEvaluate implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	* 活动评价表id
	*/
		@ApiModelProperty(value = "活动评价表id")
		private Long id;
	/**
	* 用户id
	*/
		@ApiModelProperty(value = "用户id")
		private Long userId;
	/**
	* 活动id
	*/
		@ApiModelProperty(value = "活动id")
		private Long activityId;
	/**
	* 父级id
	*/
		@ApiModelProperty(value = "父级id")
		private Long parentId;
	/**
	* 评价
	*/
		@ApiModelProperty(value = "评价")
		private String evaluate;
	/**
	* 是否已删除
	*/
		@ApiModelProperty(value = "是否已删除")
		private Integer isDeleted;
	/**
	* 创建人
	*/
		@ApiModelProperty(value = "创建人")
		private Long createUser;
	/**
	* 创建时间
	*/
		@ApiModelProperty(value = "创建时间")
		private LocalDateTime createTime;
	/**
	* 最后更新人
	*/
		@ApiModelProperty(value = "最后更新人")
		private Long updateUser;
	/**
	* 最后更新时间
	*/
		@ApiModelProperty(value = "最后更新时间")
		private LocalDateTime updateTime;


}
