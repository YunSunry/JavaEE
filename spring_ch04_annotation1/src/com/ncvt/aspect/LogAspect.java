package com.ncvt.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//切面
@Component("logAspect")
//把当前类配置为一个切面
@Aspect()
public class LogAspect {
	
	@Pointcut("execution(* com.ncvt.service.impl.*.*Customer(..))")
	private void Pointcut() {
		
	}
	
	
	/**
	 * 前置通知
	 */
	@Before(value = "Pointcut()")
	public void beforePrintLog() {
		System.out.println("LogAspect类调用了beforePrintLog(),打印log的日志开始l");
	}
	
	/**
	 * 正常放回通知
	 */
	
	@AfterReturning("Pointcut()")
	public void afterReturnPrintLog() {
		System.out.println("LogAspect类调用了afterReturnPrintLog(),打印log的日志开始l");
	}
	
	/**
	 * 异常放回通知
	 */
	
	@AfterThrowing("Pointcut()")
	public void afterThrowingPrintLog() {
		System.out.println("LogAspect类调用了afterThroeingPrintLog(),打印log的日志开始l");
	}
	
	/**
	 * 最终通知
	 */
	@After("Pointcut()")
	public void afterPrintLog() {
		System.out.println("LogAspect类调用了afterPrintLog(),打印log的日志开始l");
	}
	
	
	
}
