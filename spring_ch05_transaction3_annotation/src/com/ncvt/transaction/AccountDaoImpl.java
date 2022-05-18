package com.ncvt.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;

@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	@Override
	public String queryAccount(String name) throws Exception {
		double money=0;
		try {
			money=jdbcTemplate.queryForObject("select money from t_account where username=?", Double.class);
		} catch (Exception e) {
			throw new Exception();
		}
		
		return String.valueOf(money);
	}
	
	
	
	@Override
	public void subAccountMoney(String name, double money) throws Exception {
		try {
			jdbcTemplate.update("update t_account set money=money-? where username=?",money,name);
		} catch (Exception e) {
			throw new Exception();
		}

	}
	
	
	@Override
	public void addAccountMoney(String name, double money) throws Exception {
		// TODO Auto-generated method stub
		try {
			jdbcTemplate.update("UPDATE t_account set money=money+? WHERE username=?",money,name);
		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception();
		}
		
	}
	
	@Transactional
	@Override
	public void tranfAccount(String sourceName, String targetName, double money) throws Exception {
				subAccountMoney(sourceName, money);
				System.out.println("转出成功");
				int a=10/0;
				addAccountMoney(targetName, money);
				System.out.println("转入成功");

	}
	
	
	
	
	

}
