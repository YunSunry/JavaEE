package com.ncvt.service.impl;

import org.springframework.stereotype.Service;
import com.ncvt.service.CustomerService;


@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Override
	public void saveCustomer() {
		// TODO Auto-generated method stub
		System.out.println("����ͻ���Ϣ");

	}

	@Override
	public void delCustomer() {
		// TODO Auto-generated method stub
		System.out.println("ɾ���ͻ���Ϣ");
	}

}
