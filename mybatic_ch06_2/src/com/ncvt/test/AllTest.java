package com.ncvt.test;

import java.io.InputStream;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.io.Resources;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.ncvt.dao.StudentDao;
import com.ncvt.dao.impl.StudentDaoImpl;
import com.ncvt.domain.Student;

public class AllTest {
	private static SqlSessionFactory factory;
	private static StudentDao dao;
	
//	�ѹ��е���ȡ����
	static {
		InputStream is =null;
		try {
			is = Resources.getResourceAsStream("mybatis-config.xml");
			factory = new SqlSessionFactoryBuilder().build(is);
			dao = new StudentDaoImpl(factory);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			
		}
	}
	
//	��������
//	@Test
//	public void testInsert() throws Exception {
//		Student stu = new Student("sdfs��",new SimpleDateFormat("yyyy-MM-dd").parse("2010-10-1"),"1245358652");
//		dao.insertStudent(stu);
//		
//	}
//	ɾ������
//	@Test
//	public void testDelete() {
//		dao.deleteStudent(4);
//	}
//	��������
//	@Test
//	public void testUpdate() throws ParseException {
//		Student stu = new Student("lisi��",new SimpleDateFormat("yyyy-MM-dd").parse("2010-10-1"),"1852367");
//		stu.setStuId(5);
//		dao.insertStudent(stu);
//	}
	
	
//	��ѯһ������
//	@Test
//	public void testSeleteStudentById() {
//		System.out.println(dao.seleteStudentById(1));
//	}
	
	
//	��ѯ�������
//	@Test
//	public void testSelectAllStudents() {
//		System.out.println(dao.selectAllStudents());
//	}
//	
	
//	@Test
//	public void testGetCount() {
//		dao.getCount();
//	}
	
//	@Test
//	public void testSelectAllStudents2() {
//		System.out.println(dao.selectAllStudents2());
//	}
	
	
//	@Test
//	public void testSelectAllStudentsHashMap() {
//		System.out.println(dao.selectAllStudentToHashMap());
//	}
//	
	
//	@Test
//	public void testSelectStudentByBirthdate() {
//		Map<String, Date> dateMap = new HashMap<String, Date>();
//		dateMap.put("startDate",Date.valueOf("1990-01-01"));
//		dateMap.put("endDate",Date.valueOf("1999-12-20"));
//		System.out.println(dao.selectStudentByBirthdate(dateMap));
//	}
//	
	
	
//	@Test
//	public void testSelectStatistics() {
//		System.out.println("���ֵ"+dao.selectStatistics("MAX(stu_id)"));
//		System.out.println("ͳ��ֵ"+dao.selectStatistics("count(*)"));
//	}
	
	
	//����stu_nameģ����ѯ
	@Test
	public void testSelectStudentByName() {
		System.out.println(dao.selectStudentByName("��"));
	}

	
	
	
}
