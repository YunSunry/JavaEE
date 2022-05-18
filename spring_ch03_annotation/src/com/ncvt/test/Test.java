package com.ncvt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ncvt.dao.CustomerDao;
import com.ncvt.dao.impl.CustomeDaoImpl;
import com.ncvt.service.CustomService;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("config/beans.xml");
		CustomService service = (CustomService)ac.getBean("customService");
		CustomerDao customerDao = (CustomerDao) ac.getBean("customerDao",CustomeDaoImpl.class);
		service.saveCustomService();
		customerDao.saveCustomer();

	}

}
