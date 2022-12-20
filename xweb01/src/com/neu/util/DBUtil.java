package com.neu.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 *数据库连接工具
 *请不要修改代码
 *
 */
public class DBUtil {
	/**
	 * 
	 * 获得数据库连接对象
	 * @return 鏁版嵁搴撹繛鎺ュ璞�
	 */
	public static Connection  getConnection() {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/xwebdb";
		String user = "xwebdb";
		String password = "xwebdb";
		Connection con=null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}
	
	/**
	 * 鍏抽棴鏁版嵁搴撹繛鎺ュ璞�
	 * @param conn 鏁版嵁搴撹繛鎺ュ璞�
	 */
	public static void closeConnection(Connection conn) {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO 鑷姩鐢熸垚鐨� catch 鍧�
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Connection conn=getConnection();
		System.out.println(conn);
		closeConnection(conn);
	}
}
