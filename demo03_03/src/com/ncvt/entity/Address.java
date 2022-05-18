package com.ncvt.entity;
/**
 * 地址
 * @author wu
 * 基本数据类型
 *
 */

public class Address {
	/**
	 * 省份
	 */
	private String prov;
	
	/**
	 * 城市
	 */
	
	private String city;
	
	/**
	 * 街道
	 */
	
	private String street;

	public String getProv() {
		return prov;
	}

	public void setProv(String prov) {
		this.prov = prov;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "Address [prov=" + prov + ", city=" + city + ", street=" + street + "]";
	}
	
	
	
	
	

}
