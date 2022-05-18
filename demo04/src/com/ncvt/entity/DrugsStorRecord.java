package com.ncvt.entity;

import java.util.Date;

public class DrugsStorRecord {
	private String id;
	private String drugsid;
	private Long num;
	private Date storagedate;
	public void setId(String id) {
		this.id = id;
	}
	public void setDrugsid(String drugsid) {
		this.drugsid = drugsid;
	}
	public void setNum(Long num) {
		this.num = num;
	}
	public void setStoragedate(Date storagedate) {
		this.storagedate = storagedate;
	}
	@Override
	public String toString() {
		return "Ò©µê¼ÇÂ¼Àà [id=" + id + ", drugsid=" + drugsid + ", num=" + num + ", storagedate=" + storagedate
				+ "]";
	}
	
	
	
	
	
	
	
}
