package com.ncvt.domain;

/**
 * 活动类型表
 * @author wu
 *
 */
public class ActivityType {
	
	public int activity_type_id;
	public String activity_type_name;
	
	public ActivityType() {
		super();
	}
	
	public ActivityType(String activity_type_name) {
		super();
		this.activity_type_name = activity_type_name;
	}
	
	public int getActivity_type_id() {
		return activity_type_id;
	}
	public void setActivity_type_id(int activity_type_id) {
		this.activity_type_id = activity_type_id;
	}
	public String getActivity_type_name() {
		return activity_type_name;
	}
	public void setActivity_type_name(String activity_type_name) {
		this.activity_type_name = activity_type_name;
	}
	
	@Override
	public String toString() {
		return "ActivityType [activity_type_id=" + activity_type_id + ", activity_type_name=" + activity_type_name
				+ "]";
	}
	
	
	
	
	
}
