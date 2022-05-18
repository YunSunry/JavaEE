package com.ncvt.entity;

import java.util.Date;
public class User {
	private int userId;
	private String name;
	private Date birth;
	private int age;
	public User(int userId, String name, Date birth, int age) {
		super();
		this.userId = userId;
		this.name = name;
		this.birth = birth;
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", birth=" + birth + ", age=" + age + "]";
	}
	
	
	
	
	
}
