package com.ncvt.entity;

import java.util.Date;

public class User {
	private int userId;
	private String name;
	private Date birth;
	private int age;
	
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", birth=" + birth + ", age=" + age + "]";
	}
	
	
	
	
	
	
	
	
}
