package com.ncvt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController1 {
	
	//�û������͵�·��
	@RequestMapping("/index")
	public String index() {
		System.out.print("index������������");
		return "index";
	}

}
