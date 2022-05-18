package com.ncvt.test;

import org.springframework.context.ApplicationContext;
/**
 * ≈‰÷√“¿¿µ  
 * 
 */
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ncvt.entity.User;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/ncvt/config/beans.xml");
		User user = (User) ac.getBean("user");
		System.out.println(user);
 
	}

}
