package com.ncvt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncvt.dao.CustomerDao;
import com.ncvt.dao.impl.CustomeDaoImpl;
import com.ncvt.service.CustomService;
@Service(value="customService")
public class CustomServiceImpl implements CustomService {
//	自动化 不需要实例化一个新对象
	@Autowired 
	private CustomerDao CustomerDao;
	
	@Override
	public void saveCustomService() {
		// TODO Auto-generated method stub
		System.out.println("这个方法被调用了");
//		CustomerDao dao = new CustomeDaoImpl();
		CustomerDao.saveCustomer();
		

	}

}
