package com.ncvt.dao;

public interface AccountDao {
//	添加四个方法  
	
//	1 查询账号余额
	public String queryAccount(String name);
	
	
//	减少账户金额
	public void subAccountMoney(String name,double money);
	
	
//	添加账户余额
	public void addAccountMoney(String name,double money);
	
//	交易金额

	public void tranfAccount(String sourceName, String targetName, double money);


	
	

}
