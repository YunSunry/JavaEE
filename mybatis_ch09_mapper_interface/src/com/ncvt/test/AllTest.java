package com.ncvt.test;

import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.ncvt.dao.StudentDao;

import com.ncvt.domain.Student;

public class AllTest {
	private static SqlSessionFactory factory;
	private static StudentDao dao;
	private static SqlSession session;
	
//	把共有的提取出来
	static {
		InputStream is =null;
		try {
			is = Resources.getResourceAsStream("mybatis-config.xml");
			factory = new SqlSessionFactoryBuilder().build(is);
			session=factory.openSession();
			dao = new StudentDao(session);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			
		}
	}
	
	@Test
	public void testGetAll() throws ParseException {
		Student student = new Student("tom",new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-15"),"18693");
		System.out.println(dao.getAll(student));
	}
	


}
