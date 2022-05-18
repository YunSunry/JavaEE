package com.ncvt.domain;

public class User {
	private int userId;
	private String userName;
	private String userSex;
	
	
	public User() {
	}

	public User(String userName, String userSex) {
		super();
		this.userName = userName;
		this.userSex = userSex;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userSex=" + userSex + "]";
	}

	
	

}
