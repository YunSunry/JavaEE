package com.ncvt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ncvt.dao.AccountDao;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml"); 
		
		AccountDao dao = (AccountDao)ac.getBean("accountDao");	
//		System.out.println(dao.queryAccount("xiaoming"));
//		
//		dao.subAccountMoney("xiaoming", 100);
//		System.out.println(dao.queryAccount("xiaoming"));
//		
//		dao.addAccountMoney("xiaoming", 100);
//		System.out.println(dao.queryAccount("xiaohong"));
//		
		dao.tranfAccount("xiaoming", "xiaohong", 100);
		
//	
	}

}
