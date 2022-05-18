package com.ncvt.transaction;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;


public class AccountDaoImpl implements AccountDao {
	private DataSourceTransactionManager transactionManager;
	private JdbcTemplate jdbcTemplate;
	
	
	
	public DataSourceTransactionManager getTransactionManager() {
		return transactionManager;
	}
	public void setTransactionManager(DataSourceTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}
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
	@Override
	public void tranfAccount(String sourceName, String targetName, double money) {
		// TODO Auto-generated method stub
		DefaultTransactionDefinition tdefinition = new DefaultTransactionDefinition();
		//设置事物规则，如果当前没有事物就创建一个新的事物
		tdefinition.setPropagationBehavior(DefaultTransactionDefinition.PROPAGATION_REQUIRED);
//		获取当前事物对象
		TransactionStatus ts = getTransactionManager().getTransaction(tdefinition);
		try {
			subAccountMoney(sourceName, money);
			System.out.println("转出成功");
			addAccountMoney(targetName, money);
			System.out.println("转入成功");
			transactionManager.commit(ts);
			System.out.println("转账成功");
		} catch (Exception e) {
			// TODO: handle exception
			try {
				transactionManager.rollback(ts);
				System.out.println("转账失败");
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}
		
		
		
	}
	
	
	
	
	

}
