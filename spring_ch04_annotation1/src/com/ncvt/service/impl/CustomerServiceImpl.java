package com.ncvt.service.impl;

import org.springframework.stereotype.Service;
import com.ncvt.service.CustomerService;


@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Override
	public void saveCustomer() {
		// TODO Auto-generated method stub
		System.out.println("保存客户信息");

	}

	@Override
	public void delCustomer() {
		// TODO Auto-generated method stub
		System.out.println("删除客户信息");
	}

}
