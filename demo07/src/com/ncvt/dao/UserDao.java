package com.ncvt.dao;

import java.util.List;

import com.ncvt.domain.User;

public interface UserDao {

	
//	�������
	public void insertUser(User user);

//ɾ������
	public void deleteUser(int userId);
	
//	�޸�����
	public void updateUser(User user);
	
	
	//����id��ѯ����
	public User selectUserById(int userId);
	
	//	��ѯ ģ����ѯ ����"С"���û���ѯ
	public List<User> selectByName(String value);

}
