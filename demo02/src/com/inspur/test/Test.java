package com.inspur.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.inspur.User;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		连接配置文件
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		User user = (User) ac.getBean("user");
		System.out.println(user.toString());

	}

}
