package com.ncvt.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//ʹ��ע��
@Component
@Scope("prototype")
public class User {
	public String name;
	
	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}
	
	
	
	

}
