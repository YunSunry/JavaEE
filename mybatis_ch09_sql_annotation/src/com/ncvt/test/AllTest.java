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
	
//	@Test
//	public void testAddStudent() throws ParseException {
//		Student student = new Student("Tom",new SimpleDateFormat("yyyy-MM-dd").parse("2002-12-15"),"1475");
//		dao.addStudent(student);
//	}
	
//	@Test
//	public void testUpdateStudent() throws ParseException {
//		Student student = new Student("lisi",new SimpleDateFormat("yyyy-MM-dd").parse("2002-12-15"),"1475");
//		student.setStuId(20);
//		dao.updateStudent(student);
//	}
//	
	
//	@Test
//	public void testdeleteStudent() throws ParseException {
//		dao.removeStudent(8);
//	}
	
//	@Test
//	public void testGetAllStudent() {
//		System.out.println(dao.getAllStudent());
//	}
	
//	@Test
//	public void testGetOneStudent() {
//		System.out.println(dao.getOneStudent(1));
//	}
	
	
	@Test
	public void testselectStuByContion() throws ParseException {
		Date birthdate = new SimpleDateFormat("yyyy-MM-dd").parse("2002-12-15");
		System.out.println(dao.selectStuByContition("lisi", birthdate));
	}
	
	
	


}
