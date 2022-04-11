package org.springblade.modules.friend.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class DictVo implements Serializable {

	/**
	 * 标签
	 */
	private String label;

	/**
	 * value
	 */
	private Integer value;
}
