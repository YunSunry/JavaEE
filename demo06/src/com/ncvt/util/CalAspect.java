package com.ncvt.util;

public class CalAspect {
	private long beforeTime;
	private long afterTime;
	
//	ǰ��֪ͨ
	public void beforeTime() {
		this.beforeTime = System.currentTimeMillis();
		System.out.println("ǰ��֪ͨ ϵͳ��ǰʱ�䣨���룩="+this.beforeTime);
	}
	
//	����֪ͨ
	public void afterReturnTime() {
		this.afterTime = System.currentTimeMillis();
		System.out.println("����֪ͨ ϵͳ��ǰʱ�䣨���룩="+this.afterTime);
		long time = this.afterTime-this.beforeTime;
		System.out.println("������ʱ��="+time);
	}

}
