package com.ncvt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ncvt.entity.User;

//ModelAndiView类（包含有iew(object) model(ModelMap)) Model(接口)的使用
@Controller
@RequestMapping("/hello5")
public class HelloController5 {
	
	@GetMapping("/hello1")
	public ModelAndView hello1(Model m) {
		
		User user = new User();
		user.setName("zhangsan");
		user.setuId("x004");
		ModelAndView mAndv = new ModelAndView();
		//把数据添加要页面上
		mAndv.addObject("userkey",user);
		mAndv.setViewName("view");
		
		return mAndv;
		
	}
	

}
