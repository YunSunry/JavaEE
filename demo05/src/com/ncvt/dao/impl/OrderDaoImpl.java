package com.ncvt.dao.impl;

import org.springframework.stereotype.Component;

import com.ncvt.dao.OrderDao;
@Component(value = "orderDao")
public class OrderDaoImpl implements OrderDao {

	@Override
	public void saveOrder() {
		// TODO Auto-generated method stub
		System.out.println("Order道的调用");
	}

}
