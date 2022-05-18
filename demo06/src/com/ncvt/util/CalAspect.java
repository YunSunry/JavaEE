package com.ncvt.util;

public class CalAspect {
	private long beforeTime;
	private long afterTime;
	
//	前置通知
	public void beforeTime() {
		this.beforeTime = System.currentTimeMillis();
		System.out.println("前置通知 系统当前时间（毫秒）="+this.beforeTime);
	}
	
//	后置通知
	public void afterReturnTime() {
		this.afterTime = System.currentTimeMillis();
		System.out.println("后置通知 系统当前时间（毫秒）="+this.afterTime);
		long time = this.afterTime-this.beforeTime;
		System.out.println("共消耗时间="+time);
	}

}
