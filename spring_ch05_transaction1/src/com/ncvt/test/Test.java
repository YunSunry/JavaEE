package com.ncvt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ncvt.transaction.AccountDao;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml"); 
		
		AccountDao dao = (AccountDao)ac.getBean("accountDao");	
		dao.tranfAccount("xiaoming", "xiaohong", 100);
		
//	
	}

}
