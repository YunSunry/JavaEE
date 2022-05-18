package com.ncvt.dao.impl;

import org.springframework.stereotype.Component;

import com.ncvt.dao.CustomerDao;
@Component("customerDao")
public class CustomerDaoImpl implements CustomerDao {

	@Override
	public void saveCustomer() {
		// TODO Auto-generated method stub
		System.out.println("这里保留了客户信息");
	}

}
