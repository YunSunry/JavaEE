package com.ncvt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController1 {
	
	//用户请求发送的路径
	@RequestMapping("/index")
	public String index() {
		System.out.print("index方法被调用了");
		return "index";
	}

}
