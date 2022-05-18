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
	
//	�ѹ��е���ȡ����
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
//		System.out.println("ɾ���ɹ�");
//	}
	
	
//	@Test
//	public void testInsertUser() {
//		User user = new User("����","��");
//		dao.insertUser(user);
//		System.out.println("��ӳɹ�һ����¼");
//	}

	
//	@Test
//	public void testUpdateUser() {
//		User user = new User("����","��");
//		user.setUserId(8);
//		dao.updateUser(user);
//		System.out.println("�޸ĳɹ�");
//	}
//	
	
//	@Test
//	public void testSelectUserById() {
//		System.out.println(dao.selectUserById(5));
//		System.out.println("��ѯ�ɹ�");
//	}
//	
	
	@Test
	public void testSelectUserByName() {
		System.out.println(dao.selectByName("С"));
	}

	
	
	

}
