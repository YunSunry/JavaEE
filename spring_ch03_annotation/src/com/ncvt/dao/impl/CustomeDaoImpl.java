package com.ncvt.dao.impl;

import org.springframework.stereotype.Service;

import com.ncvt.dao.CustomerDao;

@Service(value="customerDao")
public class CustomeDaoImpl implements CustomerDao {
	

	@Override
	public void saveCustomer() {
		// TODO Auto-generated method stub
		System.out.println("dao实现客户信息保存");
		
	}

}
