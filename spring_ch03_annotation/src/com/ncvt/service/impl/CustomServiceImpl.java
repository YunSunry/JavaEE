package com.ncvt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncvt.dao.CustomerDao;
import com.ncvt.dao.impl.CustomeDaoImpl;
import com.ncvt.service.CustomService;
@Service(value="customService")
public class CustomServiceImpl implements CustomService {
//	�Զ��� ����Ҫʵ����һ���¶���
	@Autowired 
	private CustomerDao CustomerDao;
	
	@Override
	public void saveCustomService() {
		// TODO Auto-generated method stub
		System.out.println("���������������");
//		CustomerDao dao = new CustomeDaoImpl();
		CustomerDao.saveCustomer();
		

	}

}
