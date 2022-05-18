package com.ncvt.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

import com.ncvt.dao.UserDao;
import com.ncvt.domain.User;


public class UserDaoImpl implements UserDao {

	private SqlSessionFactory factory;
	
	
	
	public UserDaoImpl(SqlSessionFactory factory) {
		this.factory = factory;
	}
	

	
	
	
//根据id来删除数据
	@Override
	public void deleteUser(int userId) {
		// TODO Auto-generated method stub
//		初始化会话
		SqlSession session = null;
		try {
			session = factory.openSession();
			session.delete("com.ncvt.Mapper.User.deleteUser",userId);
			//提交会话
			session.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Logger.getLogger(UserDaoImpl.class).debug(e.getMessage());
		}finally {
			session.close();
		}
		
	}

//	添加数据
	@Override
	public void insertUser(User user) {
		// TODO Auto-generated method stub
//		初始化会话
		SqlSession session = null;
		try {
			session = factory.openSession();
			session.insert("com.ncvt.Mapper.User.insertUser",user);
			//提交会话
			session.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Logger.getLogger(UserDaoImpl.class).debug(e.getMessage());
		}finally {
			session.close();
		}
	}


	
	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		SqlSession session = null;
		try {
			session = factory.openSession();
			session.update("com.ncvt.Mapper.User.updateUser",user);
			//提交会话
			session.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Logger.getLogger(UserDaoImpl.class).debug(e.getMessage());
		}finally {
			session.close();
		}
	}
	

	@Override
	public User selectUserById(int userId) {
		// TODO Auto-generated method stub
		SqlSession session = null;
		try {
			session = factory.openSession();
			session.selectOne("com.ncvt.Mapper.User.selectUserById",userId);
			//提交会话
			session.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Logger.getLogger(UserDaoImpl.class).debug(e.getMessage());
		}finally {
			session.close();
		}
		return null;
	}





	
	
	
	
	@Override
	public List<User> selectByName(String value) {
		// TODO Auto-generated method stub
		SqlSession session=null;
		try {
			session = factory.openSession();
			List<User> list=session.selectList("com.ncvt.Mapper.User.selectUserByName",value);// 调用sql语句
			session.commit();// 提交数据
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			Logger.getLogger(UserDaoImpl.class).debug(e.getMessage());
		}finally {
			session.close();// 关闭数据库
		}
		return null;
	}


}
