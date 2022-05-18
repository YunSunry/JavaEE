package com.ncvt.text;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ncvt.utils.DBUtil;

public class Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml"); 
		DBUtil dbUtil = ac.getBean("dBUtil",DBUtil.class);
		System.out.println(dbUtil);

	}

}
