package com.ncvt.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//默认id是类名
@Component
@Scope("prototype")
public class Pet {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + "]";
	}

}
