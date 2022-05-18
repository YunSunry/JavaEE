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
	
	//��һ������
	//��ַ ��/hello3/hello2?name=lisi&class=5
	//ʹ��@RequestParam()�����ʵ�ַ�Ĳ����뷽���Ĳ�����
	@RequestMapping("/hello2")
	public String hello2(@RequestParam("name") String username,@RequestParam("class") String classNum) {
		System.out.println(username);
		System.out.println(classNum);
		return "index";
	}
	
	
	//��ַhttp://localhost:8080/springmvc_ch12_1/hello3/hello3/lisii/4
	// ����url��ַд����restful��� ͨ�� @PathVariable ע�� ��������ַ�����ͷ���������ӳ��
	@RequestMapping("/hello3/{name}/{class}")
	public String hello3(@PathVariable("name") String username,@PathVariable("class") String classNum) {
		System.out.println(username);
		System.out.println(classNum);
		return "index";
	}
	
	
	//��ַhttp://localhost:8080/springmvc_ch12_1/hello3/hello4?nums=1,2,3,4
	//���� hello3/hello4?nums=1$nums=2?nums=3$nums=4
	@RequestMapping("/hello4")
	public String hello4(Integer[] nums) {
		
//		for (Integer n :nums) {
//			System.out.println(n);
//		}
		//lamda���ʽ ��forѭ���ı��ʽЧ����һ����
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
