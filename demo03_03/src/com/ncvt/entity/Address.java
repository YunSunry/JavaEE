package com.ncvt.entity;
/**
 * ��ַ
 * @author wu
 * ������������
 *
 */

public class Address {
	/**
	 * ʡ��
	 */
	private String prov;
	
	/**
	 * ����
	 */
	
	private String city;
	
	/**
	 * �ֵ�
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
