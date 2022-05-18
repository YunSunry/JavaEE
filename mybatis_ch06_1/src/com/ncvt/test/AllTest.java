package com.ncvt.test;

import java.io.InputStream;
import java.text.SimpleDateFormat;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.ncvt.domain.Student;

public class AllTest {
	
	@Test
	public void testInsert() throws Exception {
		InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
		Student stu = new Student("ÀîËÄ",new SimpleDateFormat("yyyy-MM-dd").parse("2010-10-1"),"1245358652");
		SqlSession session = factory.openSession();
		session.insert("com.ncvt.Mapper.Student.insertStudent", stu);
		session.commit();
		session.close();
	
		
	}
}
