package com.ncvt.entity;

import java.util.Date;

public class User {
	private int userId;
	private String name;
	private Date birth;
	
	
	public User(int userId, String name, Date birth) {
		super();
		this.userId = userId;
		this.name = name;
		this.birth = birth;
	}


	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", birth=" + birth + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
}
