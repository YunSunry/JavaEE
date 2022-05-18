package com.ncvt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ncvt.entity.User;

//ModelAndiView�ࣨ������iew(object) model(ModelMap)) Model(�ӿ�)��ʹ��
@Controller
@RequestMapping("/hello5")
public class HelloController5 {
	
	@GetMapping("/hello1")
	public ModelAndView hello1(Model m) {
		
		User user = new User();
		user.setName("zhangsan");
		user.setuId("x004");
		ModelAndView mAndv = new ModelAndView();
		//���������Ҫҳ����
		mAndv.addObject("userkey",user);
		mAndv.setViewName("view");
		
		return mAndv;
		
	}
	

}
