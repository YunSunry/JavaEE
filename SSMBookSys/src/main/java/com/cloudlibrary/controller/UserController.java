package com.cloudlibrary.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cloudlibrary.domain.User;
import com.cloudlibrary.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	public String loginString(User user,HttpServletRequest request) {
		User u =  userService.login(user);
		//��ȡsession
		HttpSession session = request.getSession();
		
		session.setAttribute("USER_SESSION", u);
		if (u!=null) {
			
			String role = u.getUserRole();
			//�ж��û���ɫ
			if ("ADMIN".equals(role)) {
				return "redirect:/admin/main.jsp";
			}else {
				return "redirect:/admin/index.jsp";
			}
			
			
			
		}else {
			return "forward:/admin/login.jsp";
		}
		
	
	}

}
