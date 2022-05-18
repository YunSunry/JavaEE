package com.ncvt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 请求转发和重定向
 * @author wu
 *
 */
@Controller
@RequestMapping("/hello4")
public class HelloController4 {
	
	@RequestMapping("/forward")
	public String hello1() {
		System.out.println("hello()1请求转发");
		return "forward:/index.jsp";
	}
	
	
	@RequestMapping("/redirect")
	public String hello2() {
		System.out.println("hello()2重定向");
		return "redirect:/index.jsp";
	}

}
