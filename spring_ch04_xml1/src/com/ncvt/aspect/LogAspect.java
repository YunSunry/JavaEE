package com.ncvt.aspect;

//����
public class LogAspect {
	
	/**
	 * ǰ��֪ͨ
	 */
	
	public void beforePrintLog() {
		System.out.println("LogAspect�������beforePrintLog(),��ӡlog����־��ʼl");
	}
	
	/**
	 * �����Ż�֪ͨ
	 */
	
	public void afterReturnPrintLog() {
		System.out.println("LogAspect�������afterReturnPrintLog(),��ӡlog����־��ʼl");
	}
	
	/**
	 * �쳣�Ż�֪ͨ
	 */
	
	public void afterThrowingPrintLog() {
		System.out.println("LogAspect�������afterThroeingPrintLog(),��ӡlog����־��ʼl");
	}
	
	/**
	 * ����֪ͨ
	 */
	
	public void afterPrintLog() {
		System.out.println("LogAspect�������afterPrintLog(),��ӡlog����־��ʼl");
	}
	
	
	
}
