package com.javan.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javan.entity.User;
import com.javan.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/login")
	public String login(User user, HttpServletRequest request) {
		try {
			User u = userService.login(user);
			System.out.println(u);
//			if (u != null) {
//				request.getSession().setAttribute("USER_SESSION", u);
//				String role = u.getUserRole();
//				if ("ADMIN".equals(role)) {
//					return "redirect:/admin/main.jsp";
//				} else {
//					return "redirect:/admin/index.jsp";
//				}
//			}
			request.setAttribute("msg", "用户名或密码错误，请再次输入");
			return "redirect:/admin/main.jsp";
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("msg", "登录失败");
			return "forward:/admin/login.jsp";
		}
	}

}
