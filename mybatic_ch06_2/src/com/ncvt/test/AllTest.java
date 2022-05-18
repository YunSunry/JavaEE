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
	
//	把共有的提取出来
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
	
//	插入数据
//	@Test
//	public void testInsert() throws Exception {
//		Student stu = new Student("sdfs五",new SimpleDateFormat("yyyy-MM-dd").parse("2010-10-1"),"1245358652");
//		dao.insertStudent(stu);
//		
//	}
//	删除数据
//	@Test
//	public void testDelete() {
//		dao.deleteStudent(4);
//	}
//	更修数据
//	@Test
//	public void testUpdate() throws ParseException {
//		Student stu = new Student("lisi五",new SimpleDateFormat("yyyy-MM-dd").parse("2010-10-1"),"1852367");
//		stu.setStuId(5);
//		dao.insertStudent(stu);
//	}
	
	
//	查询一条数据
//	@Test
//	public void testSeleteStudentById() {
//		System.out.println(dao.seleteStudentById(1));
//	}
	
	
//	查询多条语句
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
//		System.out.println("最大值"+dao.selectStatistics("MAX(stu_id)"));
//		System.out.println("统计值"+dao.selectStatistics("count(*)"));
//	}
	
	
	//根据stu_name模糊查询
	@Test
	public void testSelectStudentByName() {
		System.out.println(dao.selectStudentByName("三"));
	}

	
	
	
}
