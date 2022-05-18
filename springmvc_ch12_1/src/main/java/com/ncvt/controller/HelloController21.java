package com.ncvt.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ncvt.entity.User;
/**
 * 所有影射的方法 放回的都是json数据 
 * 也就不需要responseBody了
 * @author wu
 *放回json数据 需要配置<mvc:annotation-driven/> 同时添加依赖同时在pom.xml添加依赖com.fasterxml.jackson.core
 *@restController 相当于 Controller和responseBody
 */

@RestController
@RequestMapping("/hello21")
public class HelloController21 {
	//放回json数据 需要配置<mvc:annotation-driven/> 同时添加依赖
		
		@GetMapping("/hello1")
		public User hello1() {
			User user = new User();
			user.setName("zhangsan");
			user.setuId("x1101");	
			return user;
		}
		
		
		//访问地址：/hello2/hello2?name=lisi&uId=x001
		//地址参数必须与User对象属性一致，方法参数才能获取到数据，并封装成一个对象
		
		@GetMapping("/hello2")
		public User hello2(User user) {
			System.out.println(user);
			return user;
		}
		
		
		@GetMapping("/hello3")
		public List<User> hello3(User user) {
			List<User> list = new ArrayList<User>();
			list.add(user);
			list.add(user);
			return list;
		}
		
	

}
