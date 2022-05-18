package com.ncvt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ncvt.dao.CustomerDao;
import com.ncvt.service.CustomerService;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		CustomerService service = ac.getBean("customerService",CustomerService.class);
		CustomerDao dao = ac.getBean("customerDao",CustomerDao.class);
		service.saveCustomer();
		dao.saveCustomer();

	}

}
