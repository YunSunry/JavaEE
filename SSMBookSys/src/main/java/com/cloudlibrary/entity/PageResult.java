package com.cloudlibrary.entity;

import java.util.List;

public class PageResult<E> {
	
	
	private long total;//总数
	private List<E> datas;//返回数据类型
	
	
	public PageResult(long total, List<E> datas) {
		super();
		this.total = total;
		this.datas = datas;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<E> getDatas() {
		return datas;
	}
	public void setDatas(List<E> datas) {
		this.datas = datas;
	}
	@Override
	public String toString() {
		return "PageResult [total=" + total + ", datas=" + datas + "]";
	}
	
	
	
	
	
	
	
}
