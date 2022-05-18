package com.ncvt.domain;

import java.util.Date;

public class Student {
	private int stuId;
	private String stuName;
	private Date stuBirthdate;
	private String stuPhone;

	public Student() {
	}
	public Student(String stuName, Date stuBirthdate, String stuPhone) {
		super();
		this.stuName = stuName;
		this.stuBirthdate = stuBirthdate;
		this.stuPhone = stuPhone;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public Date getStuBirthdate() {
		return stuBirthdate;
	}
	public void setStuBirthdate(Date stuBirthdate) {
		this.stuBirthdate = stuBirthdate;
	}
	public String getStuPhone() {
		return stuPhone;
	}
	public void setStuPhone(String stuPhone) {
		this.stuPhone = stuPhone;
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", stuBirthdate=" + stuBirthdate + ", stuPhone="
				+ stuPhone + "]";
	}
	
	
	
	
	

}
