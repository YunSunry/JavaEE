package com.ncvt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ncvt.dao.ProductDao;
import com.ncvt.service.ProductService;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		ProductDao productDao = (ProductDao) ac.getBean("productDao");
		ProductService productService = ac.getBean("productService",ProductService.class);
		System.out.print(productDao.saveUser());
		System.out.println(productService.saveUser());

	}

}
