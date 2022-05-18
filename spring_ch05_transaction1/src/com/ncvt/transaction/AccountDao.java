package com.ncvt.transaction;

public interface AccountDao {
	
//	1 查询账号余额
	public String queryAccount(String name) throws Exception;
	
	
//	减少账户金额
	public void subAccountMoney(String name,double money) throws Exception;
	
	
//	添加账户余额
	public void addAccountMoney(String name,double money) throws Exception;
	
//	交易金额

	public void tranfAccount(String sourceName, String targetName, double money);


}
