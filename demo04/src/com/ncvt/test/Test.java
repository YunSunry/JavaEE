package com.ncvt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ncvt.entity.Department;
import com.ncvt.entity.DrugsStorRecord;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/ncvt/config/beans.xml");
		//部门类
		Department department = (Department) ac.getBean("department");	
		//药店记录类
		DrugsStorRecord drugs = (DrugsStorRecord) ac.getBean("drugsStorRecord");	
		System.out.println(department);
		System.out.println(drugs);
	}

}
