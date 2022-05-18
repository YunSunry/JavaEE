package com.ncvt.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//����
@Component("logAspect")
//�ѵ�ǰ������Ϊһ������
@Aspect()
public class LogAspect {
	
	//����֪ͨ
	@Around("execution(* com.ncvt.service.impl.*.*Customer(..))")
	public void aroundPrintLog(ProceedingJoinPoint pjp) {
		System.out.println("ǰ��֪ͨPrintLog(),��־���ڴ�ӡ��.....");
		Object rtValue = null;
		Object[] objects =pjp.getArgs();
		
//		��������㷽��
		try {
			rtValue=pjp.proceed(objects);
			System.out.println("��������֪ͨaroundPointLog()�����ڴ�ӡ��־.....");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println("�쳣����֪ͨaroundPointLog()�����ڴ�ӡ��־.....");
			e.printStackTrace();
		}finally {
			System.out.println("���շ���֪ͨaroundPointLog()�����ڴ�ӡ��־.....");
		}
	}
	
	
	
}
