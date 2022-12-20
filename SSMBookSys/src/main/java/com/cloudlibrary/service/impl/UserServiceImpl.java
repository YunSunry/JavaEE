package com.cloudlibrary.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloudlibrary.dao.UserMapper;
import com.cloudlibrary.domain.User;
import com.cloudlibrary.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	// ÊµÀý»¯user
	@Autowired
	private UserMapper userMapper;

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub

		return userMapper.login(user);
	}

}
