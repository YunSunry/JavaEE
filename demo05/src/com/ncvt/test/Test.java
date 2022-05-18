package com.ncvt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ncvt.dao.OrderDao;
import com.ncvt.service.OrderService;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("config/beans.xml");
		
		OrderService order = ac.getBean("orderService",OrderService.class);
		order.saveOrderService();
		
		OrderDao dao = ac.getBean("orderDao",OrderDao.class);
		dao.saveOrder();
	}

}
