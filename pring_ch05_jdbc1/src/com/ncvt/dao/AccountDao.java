package com.ncvt.dao;

public interface AccountDao {
//	����ĸ�����  
	
//	1 ��ѯ�˺����
	public String queryAccount(String name);
	
	
//	�����˻����
	public void subAccountMoney(String name,double money);
	
	
//	����˻����
	public void addAccountMoney(String name,double money);
	
//	���׽��

	public void tranfAccount(String sourceName, String targetName, double money);


	
	

}
