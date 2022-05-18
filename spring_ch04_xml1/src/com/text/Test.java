package com.text;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ncvt.service.CustomerService;
import com.ncvt.service.impl.CustomerServiceImpl;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml"); 
		CustomerService service = ac.getBean("customerService",CustomerService.class);
		service.saveCustomer();
		service.delCustomer();

	}

}
