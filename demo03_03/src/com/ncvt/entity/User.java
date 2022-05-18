package com.ncvt.entity;
/**
 * User��
 * @author wu
 *
 */

import java.util.Set;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class User {
	private int id;   //�û����
	private String name;   //�û�����
	private int age;  //�û�����
	private double sal;   //����
	private String stunoArray[];    //����
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
