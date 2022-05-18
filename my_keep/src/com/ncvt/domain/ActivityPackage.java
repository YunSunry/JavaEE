package com.ncvt.domain;

/**
 * »î¶¯Ì×²Í±í
 * @author wu
 *
 */
public class ActivityPackage {
	public int activity_package_id;
	public int activity_id;
	public Double package_price;
	public String package_name;
	public String package_pic;
	
	
	public ActivityPackage() {
		super();
	}


	public ActivityPackage(int activity_id, Double package_price, String package_name, String package_pic) {
		super();
		this.activity_id = activity_id;
		this.package_price = package_price;
		this.package_name = package_name;
		this.package_pic = package_pic;
	}


	public int getActivity_package_id() {
		return activity_package_id;
	}


	public void setActivity_package_id(int activity_package_id) {
		this.activity_package_id = activity_package_id;
	}


	public int getActivity_id() {
		return activity_id;
	}


	public void setActivity_id(int activity_id) {
		this.activity_id = activity_id;
	}


	public Double getPackage_price() {
		return package_price;
	}


	public void setPackage_price(Double package_price) {
		this.package_price = package_price;
	}


	public String getPackage_name() {
		return package_name;
	}


	public void setPackage_name(String package_name) {
		this.package_name = package_name;
	}


	public String getPackage_pic() {
		return package_pic;
	}


	public void setPackage_pic(String package_pic) {
		this.package_pic = package_pic;
	}


	@Override
	public String toString() {
		return "ActivityPackage [activity_package_id=" + activity_package_id + ", activity_id=" + activity_id
				+ ", package_price=" + package_price + ", package_name=" + package_name + ", package_pic=" + package_pic
				+ "]";
	}
	
	
	
	
	
	

}
