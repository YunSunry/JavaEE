package com.ncvt.test;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import org.junit.Test;
import com.ncvt.dao.UserDao;
import com.ncvt.dao.impl.UserDaoImpl;
import com.ncvt.domain.User;



public class AllTest {

	private static SqlSessionFactory factory;
	private static UserDao dao;
	
//	把共有的提取出来
	static {
		InputStream is =null;
		try {
			is = Resources.getResourceAsStream("mybatis-config.xml");
			factory = new SqlSessionFactoryBuilder().build(is);
			dao = new UserDaoImpl(factory);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			
		}
	}
	
	
//	@Test
//	public void testDelete() {
//		dao.deleteUser(8);
//		System.out.println("删除成功");
//	}
	
	
//	@Test
//	public void testInsertUser() {
//		User user = new User("王四","男");
//		dao.insertUser(user);
//		System.out.println("添加成功一条记录");
//	}

	
//	@Test
//	public void testUpdateUser() {
//		User user = new User("老王","男");
//		user.setUserId(8);
//		dao.updateUser(user);
//		System.out.println("修改成功");
//	}
//	
	
//	@Test
//	public void testSelectUserById() {
//		System.out.println(dao.selectUserById(5));
//		System.out.println("查询成功");
//	}
//	
	
	@Test
	public void testSelectUserByName() {
		System.out.println(dao.selectByName("小"));
	}

	
	
	

}
