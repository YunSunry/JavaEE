package com.neu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.neu.bean.User;
import com.neu.util.DBUtil;

/**
 * 对应user表得持久层
 */
public class UserDao {
	/**
	 * 根据用户名查找一条记录
	 * 
	 * @param userName 用户名字
	 * @return User 鐢ㄦ埛Bean
	 */
	public User getUserByName(String userName, String password) {
		// 代码编写处
		//练习  根据用户名和密码查询用户
		Connection conn = DBUtil.getConnection();
		String sql = "select * from user where username = '"+userName+"' and password = '"+password+"'";
		System.out.println(sql);
		User user = null;
		try {
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			if (rs.next()) {
				user = new User();
				user.setId(rs.getString(1));
				user.setUserName(rs.getString(2));
				user.setPassword(rs.getString(3));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return user;
	}

	/**
	 * 所有用户表得信息
	 * 
	 * @return 用户列表
	 */
	public List<User> getAll() {

		//练习 查询所有
		Connection conn = DBUtil.getConnection();
		String sql = "select * from user";
		User user = null;
		List<User> list = new ArrayList();
		try {
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			user = new User();
			while (rs.next()) {
				user = new User();
				user.setId(rs.getString(1));
				user.setUserName(rs.getString(2));
				user.setPassword(rs.getString(3));
				list.add(user);
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return list;
	}

	/**
	 * 根据id查询一条记录
	 * @param id
	 * @return
	 */
	public User getUserById(String id) {

		//练习根据id查询一条数据
		Connection conn = DBUtil.getConnection();
		String sql = "select * from user where id = '"+id+"'";
		User user = null;
		try {
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while (rs.next()) {
				user = new User();
				user.setId(rs.getString(1));
				user.setUserName(rs.getString(2));
				user.setPassword(rs.getString(3));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return user;

	}

	/**
	 * 修改
	 * @param id
	 * @param userName
	 * @param password
	 */
	public void updateUser(String id, String userName, String password) {

		//修改
		Connection conn = DBUtil.getConnection();
		String sql = "update user set username = '"+userName+"',password = '"+password+"' where id = '"+id+"'";
		System.out.println(sql);
		try {
			Statement stm = conn.createStatement();
			stm.execute(sql);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	/**
	 * 删除
	 * @param id
	 */
	public void deleteUser(String id) {

		//练习 删除
		Connection conn = DBUtil.getConnection();
		String sql = "delete from user where id = '"+id+"'";
		try {
			Statement stm = conn.createStatement();
			stm.execute(sql);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	
	/**
	 * 添加语句
	 * @param id
	 * @param userName
	 * @param password
	 */
	
	public void AddUser(String id, String userName, String password) {
		Connection conn = DBUtil.getConnection();
		// 拼接数据库
		String sql = "INSERT INTO user() VALUE('" + id + "','" + userName + "','" + password + "')";
		System.out.println(sql);
		try {
			Statement stm = conn.createStatement();
			stm.execute(sql);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	/**
	 * 模糊查询
	 * @return
	 */
	public List<User> searchByUserName(String username) {

		// 1 获取连接对象
		Connection conn = DBUtil.getConnection();
		// 2拼接sql语句
		String sql = "SELECT * FROM `user` WHERE username LIKE '%"+username+"%'";
		System.out.print(sql);
		List<User> list = new ArrayList<User>();

		try {
			// 3 获取statement对象
			Statement stm = conn.createStatement();
			// 4 执行sql语句
			ResultSet rs = stm.executeQuery(sql);
			// 5 从查询结果集resultset获取数据
			while (rs.next()) {
				User user = new User();
				user.setId(rs.getString(1));
				user.setUserName(rs.getString(2));
				user.setPassword(rs.getString(3));
				list.add(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;// 请修改代码
	}

	public static void main(String[] args) {
		UserDao dao = new UserDao();
//		System.out.print(dao.getAll());
//		System.out.print(dao.getUserById("1"));
//		dao.updateUser("2", "nanami", "1234");
//		dao.deleteUser("3");
//		dao.AddUser("4", "nanami", "123");
		dao.searchByUserName("z");

	}

}
