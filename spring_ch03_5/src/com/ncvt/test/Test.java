package com.ncvt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ncvt.entity.Bean3;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("config/beans.xml");
		Bean3 bean3 =(Bean3) ac.getBean("bean3");
		System.out.println(bean3.getBean1());
		System.out.println(bean3.getBean2());
		

	}

}
