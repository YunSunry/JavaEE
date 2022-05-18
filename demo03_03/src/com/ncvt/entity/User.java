package com.ncvt.entity;
/**
 * User类
 * @author wu
 *
 */

import java.util.Set;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class User {
	private int id;   //用户编号
	private String name;   //用户姓名
	private int age;  //用户年龄
	private double sal;   //工资
	private String stunoArray[];    //数组
	private List lists;		//List
	private Set sets;			//Set
	private Map scoremaps;		//Map
	private Address address;
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public void setStunoArray(String[] stunoArray) {
		this.stunoArray = stunoArray;
	}
	public void setLists(List lists) {
		this.lists = lists;
	}
	public void setSets(Set sets) {
		this.sets = sets;
	}
	public void setScoremaps(Map scoremaps) {
		this.scoremaps = scoremaps;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", sal=" + sal + ", stunoArray="
				+ Arrays.toString(stunoArray) + ", lists=" + lists + ", sets=" + sets + ", scoremaps=" + scoremaps
				+ ", address=" + address + "]";
	}
	
	
	
	
	
	
	

}
