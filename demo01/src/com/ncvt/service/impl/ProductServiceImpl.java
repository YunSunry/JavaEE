package com.ncvt.service.impl;

import com.ncvt.dao.ProductDao;
import com.ncvt.dao.impl.ProductDaoImpl;
import com.ncvt.service.ProductService;

public class ProductServiceImpl implements ProductService{
//	ʵ�����ӿ�
	private ProductDao productDao = new ProductDaoImpl();

	@Override
	public int saveUser() {
		// TODO Auto-generated method stub
		int count = productDao.saveUser();
		System.out.println("�����˴���count=="+count);
		return count;
	}

}
