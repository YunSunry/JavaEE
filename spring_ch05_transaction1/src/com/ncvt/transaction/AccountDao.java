package com.ncvt.transaction;

public interface AccountDao {
	
//	1 ��ѯ�˺����
	public String queryAccount(String name) throws Exception;
	
	
//	�����˻����
	public void subAccountMoney(String name,double money) throws Exception;
	
	
//	����˻����
	public void addAccountMoney(String name,double money) throws Exception;
	
//	���׽��

	public void tranfAccount(String sourceName, String targetName, double money);


}
