package org.springblade.common.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springblade.core.mp.base.BaseEntity;
import org.springblade.core.secure.utils.AuthUtil;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Method;
import java.util.Date;

/**
 * @Author al
 * @Date 2022/4/8
 */
@Configuration
@Aspect
public class BeforeAop {

	@Before("execution(* org.springblade.modules.activity.controller.*.submit(..))")
	public void beFore(JoinPoint joinPoint) {
		Object[] args = joinPoint.getArgs();
		for (Object arg : args) {
			if (arg instanceof BaseEntity) {
				BaseEntity par = (BaseEntity) arg;
				par.setCreateUser(AuthUtil.getUserId());
				par.setUpdateUser(AuthUtil.getUserId());
				par.setCreateTime(new Date());
				par.setUpdateTime(new Date());
			}

		}
	}


}
