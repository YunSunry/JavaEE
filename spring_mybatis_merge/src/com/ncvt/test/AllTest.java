package com.ncvt.test;

import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ncvt.dao.StudentDao;

import com.ncvt.domain.Student;

public class AllTest {
	
	private static StudentDao dao;

	
//	把共有的提取出来
	static {
		InputStream is =null;
		try {
			
			ApplicationContext ac = new  ClassPathXmlApplicationContext("ApplicationContext.xml");
			dao = (StudentDao) ac.getBean("studentDao");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			
		}
	}
	
	@Test
	public void testAddStudent() throws ParseException {
		Student student = new Student("lisi",new SimpleDateFormat("yyyy-MM-dd").parse("2002-12-15"),"1475");
		System.out.println(dao.getAll(student));
		
	}
	

	


}
