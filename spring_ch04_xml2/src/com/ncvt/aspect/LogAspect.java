package com.ncvt.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

//����
public class LogAspect {
	/**
	 * ����֪ͨ
	 */
	
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
