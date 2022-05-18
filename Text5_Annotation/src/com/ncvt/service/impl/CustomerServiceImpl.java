package com.ncvt.service.impl;

import org.springframework.stereotype.Component;

import com.ncvt.service.CustomerService;
//不加值 默认
@Component("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Override
	public void saveCustomer() {
		// TODO Auto-generated method stub
		System.out.println("此处保留了用户的最基本信息");
	}

}
