package com.ncvt.entity;

import java.util.Date;

public class User {
	private int stuId;
	private String username;
	private Date birth;
	private int age;
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
		return "User [stuId=" + stuId + ", username=" + username + ", birth=" + birth + ", age=" + age + "]";
	}
	
	

}
