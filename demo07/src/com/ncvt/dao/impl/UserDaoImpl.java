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
	

	
	
	
//����id��ɾ������
	@Override
	public void deleteUser(int userId) {
		// TODO Auto-generated method stub
//		��ʼ���Ự
		SqlSession session = null;
		try {
			session = factory.openSession();
			session.delete("com.ncvt.Mapper.User.deleteUser",userId);
			//�ύ�Ự
			session.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Logger.getLogger(UserDaoImpl.class).debug(e.getMessage());
		}finally {
			session.close();
		}
		
	}

//	�������
	@Override
	public void insertUser(User user) {
		// TODO Auto-generated method stub
//		��ʼ���Ự
		SqlSession session = null;
		try {
			session = factory.openSession();
			session.insert("com.ncvt.Mapper.User.insertUser",user);
			//�ύ�Ự
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
			//�ύ�Ự
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
			//�ύ�Ự
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
			List<User> list=session.selectList("com.ncvt.Mapper.User.selectUserByName",value);// ����sql���
			session.commit();// �ύ����
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			Logger.getLogger(UserDaoImpl.class).debug(e.getMessage());
		}finally {
			session.close();// �ر����ݿ�
		}
		return null;
	}


}
