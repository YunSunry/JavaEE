package com.cloudlibrary.entity;

public class Result<E> {

	private boolean success;
	private String message;
	private E data;
	
	public Result(boolean success, String message) {
		super();
		this.success = success;
		this.message = message;
	}
	
	
	public Result(boolean success, String message, E data) {
		super();
		this.success = success;
		this.message = message;
		this.data = data;
	}


	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
