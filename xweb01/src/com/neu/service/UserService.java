package com.neu.service;

import java.util.List;

import com.neu.bean.User;
import com.neu.dao.UserDao;

/**
 * 
 * 用户管理逻辑层
 *
 */
public class UserService {
	
	private UserDao userDao;
	
	public UserService() {
		userDao=new UserDao();
	}

	/**
	 * 获得单个用户
	 * @param userName 用户名
	 * @return 单个用户
	 */
	public User getUser(String userName,String password) {
		return userDao.getUserByName(userName,password);
	}
	/**
	 * 获得所有用户
	 * @return 用户列表
	 */
	public List<User> getUsers() {
		return userDao.getAll();
	}
	
	public User getUserById(String id) {
		return userDao.getUserById(id);
	}
	

	public void updateUser(String id,String userName,String password) {
		userDao.updateUser(id, userName, password);
	}
	//删除
	public void deleteUser(String id) {
		userDao.deleteUser(id);
	}
	
	//添加
	public void AddUser(String id,String userName,String password) {
		userDao.AddUser(id, userName, password);
	}
	
	public List<User> searchByUserName(String username) {
		return userDao.searchByUserName(username);
	}

	

}
