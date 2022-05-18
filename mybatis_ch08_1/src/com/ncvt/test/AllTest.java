package com.ncvt.test;

import java.io.InputStream;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
	
//	@Test
//	public void testQueryCondition() throws ParseException {
//		Student student = new Student("tom",new SimpleDateFormat("yyyy-MM-dd").parse("2000-10-1"),null);
//		System.out.println(dao.queryByCondition(student));
//	}
	
//	@Test
//	public void testQueryCondition2() throws ParseException {
//		Student student = new Student(null,null,"1852367");
//		System.out.println(dao.queryByCondition2(student));
//	}
//	
	
//	@Test
//	public void testQueryCondition3() throws ParseException {
//		Student student = new Student(null,new SimpleDateFormat("yyyy-MM-dd").parse("2000-10-1"),null);
//		System.out.println(dao.queryByCondition3(student));
//	}
//	
	
//	@Test
//	public void testUpdateByCondtion() throws ParseException {
//		Student stu = new Student("小明",null,"14578");
//		stu.setStuId(6);
//		dao.updateByCondtion(stu);
//	}
	
//	@Test
//	public void testUpdateByCondtion4() throws ParseException {
//		Student student = new Student(null,new SimpleDateFormat("yyyy-MM-dd").parse("2000-10-1"),"145887");
//		System.out.println(dao.queryByCondition4(student));
//	}

	
//	@Test
//	public void testUpdateByCondtion() throws ParseException {
//		Student stu = new Student("小明",new SimpleDateFormat("yyyy-MM-dd").parse("2002-05-15"),"14578");
//		stu.setStuId(6);
//		dao.updateByCondtion2(stu);
//	}
//	
	
//	@Test
//	public void testqueryByInArray() throws ParseException {
//		System.out.println(dao.queryByInArray(new int[] {1,3}));
//	}
//	
	
//	@Test
//	public void testqueryByInList() throws ParseException {
//		List<Integer> stuIdList = new ArrayList<Integer>();
//		stuIdList.add(1);
//		stuIdList.add(2);
//		System.out.println(dao.queryByInList(stuIdList));
//	}
	
//	@Test
//	public void testqueryByInMap() throws ParseException {
//		List<Integer> stuIdList = new ArrayList<Integer>();
//		stuIdList.add(1);
//		stuIdList.add(3);
//		Map<String, List<Integer>> map = new HashMap<>();
//		map.put("key1", stuIdList);
//		System.out.println(dao.queryByInMap(map));
//	}
	
	
	
	@Test
	public void testselectStudent() throws ParseException {
		System.out.println(dao.selectStudent());
	}
	
}
