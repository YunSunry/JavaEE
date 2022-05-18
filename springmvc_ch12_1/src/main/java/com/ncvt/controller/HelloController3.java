package com.ncvt.controller;

import java.util.Arrays;
import java.util.Iterator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ncvt.entity.User;

@Controller
@RequestMapping("hello3")
public class HelloController3 {
	
	@RequestMapping("/hello1")
	public String hello1(String username,String classNum) {
		System.out.println(username);
		System.out.println(classNum);
		return "index";
	}
	
	//起一个别名
	//地址 ：/hello3/hello2?name=lisi&class=5
	//使用@RequestParam()将访问地址的参数与方法的参数绑定
	@RequestMapping("/hello2")
	public String hello2(@RequestParam("name") String username,@RequestParam("class") String classNum) {
		System.out.println(username);
		System.out.println(classNum);
		return "index";
	}
	
	
	//地址http://localhost:8080/springmvc_ch12_1/hello3/hello3/lisii/4
	// 这种url地址写法是restful风格 通过 @PathVariable 注解 完成请求地址参数和方法参数的映射
	@RequestMapping("/hello3/{name}/{class}")
	public String hello3(@PathVariable("name") String username,@PathVariable("class") String classNum) {
		System.out.println(username);
		System.out.println(classNum);
		return "index";
	}
	
	
	//地址http://localhost:8080/springmvc_ch12_1/hello3/hello4?nums=1,2,3,4
	//或者 hello3/hello4?nums=1$nums=2?nums=3$nums=4
	@RequestMapping("/hello4")
	public String hello4(Integer[] nums) {
		
//		for (Integer n :nums) {
//			System.out.println(n);
//		}
		//lamda表达式 和for循环的表达式效果是一样的
		Arrays.asList(nums).forEach(System.out::println);
		return "index";
	}
	
	
	@RequestMapping("/hello5")
	public String hello5(User user) {
		System.out.println(user);
		return "index";
	}
	
	
	@ResponseBody
	@RequestMapping(value="json",method = RequestMethod.POST)
	public String json(@RequestBody User user) {
		System.out.println(user);
		return "{\"status\":\"200\"}";
	}
	
}
