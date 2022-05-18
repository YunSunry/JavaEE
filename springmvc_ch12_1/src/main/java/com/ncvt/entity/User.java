package com.ncvt.entity;

public class User {
	private String name;
	private String uId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getuId() {
		return uId;
	}
	public void setuId(String uId) {
		this.uId = uId;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", uId=" + uId + "]";
	}
	
	
	
}
