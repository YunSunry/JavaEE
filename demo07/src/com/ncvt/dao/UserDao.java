package com.ncvt.dao;

import java.util.List;

import com.ncvt.domain.User;

public interface UserDao {

	
//	添加数据
	public void insertUser(User user);

//删除数据
	public void deleteUser(int userId);
	
//	修改数据
	public void updateUser(User user);
	
	
	//根据id查询数据
	public User selectUserById(int userId);
	
	//	查询 模糊查询 带有"小"的用户查询
	public List<User> selectByName(String value);

}
