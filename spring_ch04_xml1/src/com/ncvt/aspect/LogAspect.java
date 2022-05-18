package com.ncvt.aspect;

//切面
public class LogAspect {
	
	/**
	 * 前置通知
	 */
	
	public void beforePrintLog() {
		System.out.println("LogAspect类调用了beforePrintLog(),打印log的日志开始l");
	}
	
	/**
	 * 正常放回通知
	 */
	
	public void afterReturnPrintLog() {
		System.out.println("LogAspect类调用了afterReturnPrintLog(),打印log的日志开始l");
	}
	
	/**
	 * 异常放回通知
	 */
	
	public void afterThrowingPrintLog() {
		System.out.println("LogAspect类调用了afterThroeingPrintLog(),打印log的日志开始l");
	}
	
	/**
	 * 最终通知
	 */
	
	public void afterPrintLog() {
		System.out.println("LogAspect类调用了afterPrintLog(),打印log的日志开始l");
	}
	
	
	
}
