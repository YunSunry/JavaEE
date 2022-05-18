package com.ncvt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ncvt.entity.User;

public class Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		User user1 = ac.getBean("user",User.class);
		User user2 = ac.getBean("user",User.class);
		System.out.println(user1);
		System.out.println(user2);
		user1.name = "张三";
		System.out.println(user1);
		System.out.println(user2);
		
		
//		if (user1==user2) {
//			System.out.println("是同一个");
//		}else {
//			System.out.println("不是同一个");
//		}

	}

}
