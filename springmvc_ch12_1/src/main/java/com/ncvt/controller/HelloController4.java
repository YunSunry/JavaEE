package com.ncvt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ����ת�����ض���
 * @author wu
 *
 */
@Controller
@RequestMapping("/hello4")
public class HelloController4 {
	
	@RequestMapping("/forward")
	public String hello1() {
		System.out.println("hello()1����ת��");
		return "forward:/index.jsp";
	}
	
	
	@RequestMapping("/redirect")
	public String hello2() {
		System.out.println("hello()2�ض���");
		return "redirect:/index.jsp";
	}

}
