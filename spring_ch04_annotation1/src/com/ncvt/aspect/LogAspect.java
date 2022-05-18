package com.ncvt.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//����
@Component("logAspect")
//�ѵ�ǰ������Ϊһ������
@Aspect()
public class LogAspect {
	
	@Pointcut("execution(* com.ncvt.service.impl.*.*Customer(..))")
	private void Pointcut() {
		
	}
	
	
	/**
	 * ǰ��֪ͨ
	 */
	@Before(value = "Pointcut()")
	public void beforePrintLog() {
		System.out.println("LogAspect�������beforePrintLog(),��ӡlog����־��ʼl");
	}
	
	/**
	 * �����Ż�֪ͨ
	 */
	
	@AfterReturning("Pointcut()")
	public void afterReturnPrintLog() {
		System.out.println("LogAspect�������afterReturnPrintLog(),��ӡlog����־��ʼl");
	}
	
	/**
	 * �쳣�Ż�֪ͨ
	 */
	
	@AfterThrowing("Pointcut()")
	public void afterThrowingPrintLog() {
		System.out.println("LogAspect�������afterThroeingPrintLog(),��ӡlog����־��ʼl");
	}
	
	/**
	 * ����֪ͨ
	 */
	@After("Pointcut()")
	public void afterPrintLog() {
		System.out.println("LogAspect�������afterPrintLog(),��ӡlog����־��ʼl");
	}
	
	
	
}
