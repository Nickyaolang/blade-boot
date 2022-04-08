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

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 实体类
 *
 * @author BladeX
 * @since 2022-04-08
 */
@Data
@ApiModel(value = "ActivityUser对象", description = "ActivityUser对象")
public class ActivityUser implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	* 活动人员中间表id
	*/
		@ApiModelProperty(value = "活动人员中间表id")
		private Long id;
	/**
	* 活动id
	*/
		@ApiModelProperty(value = "活动id")
		private Long activeId;
	/**
	*  参与者id
	*/
		@ApiModelProperty(value = " 参与者id")
		private Long userId;
	/**
	* 本次活动是否支付
	*/
		@ApiModelProperty(value = "本次活动是否支付")
		private Integer isPayment;
	/**
	* 金额
	*/
		@ApiModelProperty(value = "金额")
		private Integer money;


}
