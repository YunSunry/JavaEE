package com.ncvt.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.ncvt.dao.AccountDao;

public class AccountDaoImpl implements AccountDao {
	private DataSource dataSource;
	private Connection connection;
	
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		try {
			connection=this.dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String queryAccount(String name) {
		PreparedStatement psmt=null;
		int money = 0;
		try {
			psmt=connection.prepareStatement("SELECT money FROM t_account WHERE username=?");
			psmt.setString(1, name);
			ResultSet rs=psmt.executeQuery();
			rs.next();
			money=rs.getInt("money");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return String.valueOf(money);
	}

	@Override
	public void subAccountMoney(String name, double moeny) {
		PreparedStatement psmt=null;
		try {
			psmt=connection.prepareStatement("UPDATE t_account SET money=money-? WHERE username=?");
			psmt.setDouble(1, moeny);
			psmt.setString(2, name);
			psmt.execute();
			System.out.println("减少账户金额成功");
		} catch (SQLException e) {
			
			try {
				connection.rollback();
				System.out.println("减少账户金额失败");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			e.printStackTrace();
		}

	}

	@Override
	public void addAccountMoney(String name, double moeny) {
		PreparedStatement psmt=null;
		try {
			psmt=connection.prepareStatement("UPDATE t_account SET money=money+? WHERE username=?");
			psmt.setDouble(1, moeny);
			psmt.setString(2, name);
			psmt.execute();
			System.out.println("增加账户金额成功");
		} catch (SQLException e) {
			
			try {
				connection.rollback();
				System.out.println("增加账户金额失败");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			e.printStackTrace();
		}

	}


	@Override
	public void tranfAccount(String sourceName, String targetName, double money) {
		try {
			connection.setAutoCommit(false);
			
			double sum=Double.valueOf(queryAccount("xiaoming")) ;
			if (sum>money) {
				subAccountMoney(sourceName, money);
				int a=10/0;
				addAccountMoney(targetName, money);
			}
			System.out.println("转账成功");
			connection.commit();
		} catch (Exception e) {
			try {
				connection.rollback();
				System.out.println("转账失败");
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		
		

	}

	

}
