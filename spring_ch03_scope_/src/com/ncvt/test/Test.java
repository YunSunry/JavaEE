package com.ncvt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ncvt.entity.Pet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("config/beans.xml");
		Pet p1 =ac.getBean("pet",Pet.class);
		Pet p2 =ac.getBean("pet",Pet.class);
		System.out.println(p1);
		System.out.println(p2);
	}

}
