package com.ncvt.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.ncvt.entity.User;

//����json���� json����

@Controller
@RequestMapping("/hello2")
public class HelloController2 {
	
	//�Ż�json���� ��Ҫ����<mvc:annotation-driven/> ͬʱ�������
	@ResponseBody
	@GetMapping("/hello1")
	public User hello1() {
		User user = new User();
		user.setName("zhangsan");
		user.setuId("x1101");	
		return user;
	}
	
	
	//���ʵ�ַ��/hello2/hello2?name=lisi&uId=x001
	//��ַ����������User��������һ�£������������ܻ�ȡ�����ݣ�����װ��һ������
	@ResponseBody
	@GetMapping("/hello2")
	public User hello2(User user) {
		System.out.println(user);
		return user;
	}
	
	@ResponseBody
	@GetMapping("/hello3")
	public List<User> hello3(User user) {
		List<User> list = new ArrayList<User>();
		list.add(user);
		list.add(user);
		return list;
	}
	
	

}
