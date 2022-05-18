package com.ncvt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * RequestMapping入门
 * @author wu
 *
 */
@Controller
@RequestMapping("/hello1")		//定义在类上的映射代表一级目录
public class HelloConTroller {
	
	@RequestMapping("/index")
	public String index() {
		System.out.print("执行了index()");
		return "jsp/hello";
	};
	
	
	//映射方法没有放回值的情况下，会吧映射地址自动加上。jsp后缀
	@RequestMapping("/hello")
	public void index1() {
		System.out.print("执行了index1()");	
	};
	
	
	
//	@RequestMapping("hello1") 是@RequestMapping(value="/hello1")的简写形式，运行效果完全相同
	@RequestMapping(value="/hello1")
	public String hello1() {
		System.out.println("hello()1的方法被调用了");
		return "jsp/hello";
	}
	
	
	@RequestMapping(value="/hello2",method = RequestMethod.GET)
	public String hello2() {
		System.out.println("hello2()的方法被调用了");
		return "jsp/hello";
	}
	
	
	//访问地址  /hello1/hello3?p1=aa 方法中变量p1就能接受到前端提交的参数值
	@RequestMapping(value="/hello3")
	public String hello3(String p1) {
		System.out.println("hello3()的方法被调用了,P1="+p1);
		return "jsp/hello";
	}
	
	//加上params = {"p1"}后，如果请求没有提供p1参数，如：/hello1/hello4 400错误的请求方法 访问就会报错
	@RequestMapping(value="/hello4",params = {"p1"})
	public String hello4(String p1) {
		System.out.println("hello4()的方法被调用了,p1="+p1);
		return "jsp/hello";
	}
	

}
