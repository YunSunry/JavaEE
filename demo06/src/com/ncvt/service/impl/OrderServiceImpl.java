package com.ncvt.service.impl;

import com.ncvt.service.OrderService;

public class OrderServiceImpl implements OrderService {

	@Override
	public void calAllOrder() {
		// TODO Auto-generated method stub
		int total=0;
		for (int i = 0; i < 1000000; i++) {
			total+=i;
		}
		System.out.println("����ͳ�ƽ��"+total);

	}

}
