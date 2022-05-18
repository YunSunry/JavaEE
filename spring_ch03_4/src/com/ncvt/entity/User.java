package com.ncvt.entity;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class User {
	private int id;   //用户编号
	private String name;   //用户姓名
	private int age;  //用户年龄
	
	private String membersArray[];
	
	private List carsList;
	
	private Set bookSet;
	
	private Map scoreMap;
	
	private Properties petPros;
	
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

	public void setMembersArray(String[] membersArray) {
		this.membersArray = membersArray;
	}

	public void setCarsList(List carsList) {
		this.carsList = carsList;
	}

	public void setBookSet(Set bookSet) {
		this.bookSet = bookSet;
	}

	public void setScoreMap(Map scoreMap) {
		this.scoreMap = scoreMap;
	}

	public void setPetPros(Properties petPros) {
		this.petPros = petPros;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", membersArray=" + Arrays.toString(membersArray)
				+ ", carsList=" + carsList + ", bookSet=" + bookSet + ", scoreMap=" + scoreMap + ", petPros=" + petPros
				+ ", address=" + address + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
