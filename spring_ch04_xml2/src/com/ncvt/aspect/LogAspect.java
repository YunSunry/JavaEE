package com.ncvt.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

//切面
public class LogAspect {
	/**
	 * 环绕通知
	 */
	
	public void aroundPrintLog(ProceedingJoinPoint pjp) {
		System.out.println("前置通知PrintLog(),日志正在打印中.....");
		Object rtValue = null;
		Object[] objects =pjp.getArgs();
		
//		调用切入点方法
		try {
			rtValue=pjp.proceed(objects);
			System.out.println("正常返回通知aroundPointLog()，正在打印日志.....");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println("异常返回通知aroundPointLog()，正在打印日志.....");
			e.printStackTrace();
		}finally {
			System.out.println("最终返回通知aroundPointLog()，正在打印日志.....");
		}
	}
	
	
	
}
