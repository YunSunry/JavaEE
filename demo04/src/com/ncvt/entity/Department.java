package com.ncvt.entity;

import java.util.Date;

public class Department {
	private String departid;
	private String name;
	private String userid;
	private Date createdate;
	public Department(String departid, String name, String userid, Date createdate) {
		super();
		this.departid = departid;
		this.name = name;
		this.userid = userid;
		this.createdate = createdate;
	}
	@Override
	public String toString() {
		return "²¿ÃÅÀà [departid=" + departid + ", name=" + name + ", userid=" + userid + ", createdate="
				+ createdate + "]";
	}
	
	
	
	
	
	
	
	

}
