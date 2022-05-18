package com.ncvt.service.impl;

import com.ncvt.dao.UserDao;
import com.ncvt.dao.impl.UserDaoImpl;
import com.ncvt.service.UserService;

public class UserServiceImpl implements UserService {
	
	private UserDao userDao = (UserDao) new UserDaoImpl();
	@Override
	public int saveUser() {
		// TODO Auto-generated method stub
		int count = userDao.saveUser();
		System.out.println("UserServiceImpl类的saveUser()被调用，count="+count);
		return count;
	}

}
