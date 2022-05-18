package com.ncvt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ncvt.dao.OrderDao;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		OrderDao dao =  (OrderDao)ac.getBean("orderDao");
//		System.out.print(dao.saveAccount());
		dao.saveAccount();

	}

}
