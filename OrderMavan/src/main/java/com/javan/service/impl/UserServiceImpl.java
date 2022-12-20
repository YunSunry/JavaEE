package com.javan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javan.dao.UserMapper;
import com.javan.entity.User;
import com.javan.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		
		return userMapper.login(user);
	}

}
