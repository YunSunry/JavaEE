package com.ncvt.service.impl;

import org.springframework.stereotype.Component;

import com.ncvt.service.CustomerService;
//����ֵ Ĭ��
@Component("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Override
	public void saveCustomer() {
		// TODO Auto-generated method stub
		System.out.println("�˴��������û����������Ϣ");
	}

}
