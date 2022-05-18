package com.ncvt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ncvt.dao.UserDao;
import com.ncvt.service.UserService;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		实例化接口类  解析  构造方法
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		UserDao userDao = (UserDao)ac.getBean("userDao");
		UserService userService =ac.getBean("userService",UserService.class);
		System.out.println(userDao.saveUser());
		System.out.println(userService.saveUser());

	}

}
