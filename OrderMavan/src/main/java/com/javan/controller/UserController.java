package com.javan.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
	public String login(User user,HttpServletRequest request) {
		User u =  userService.login(user);
		//��ȡsession
		System.out.println(u);
		
		if (u!=null) {
			HttpSession session = request.getSession();
			session.setAttribute("USER_SESSION", u);
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
		
//		return "redirect:/admin/index.jsp";
		
	
	}
	
	
    //ע����¼
     
    @RequestMapping("/logout")
    public String logout(HttpServletRequest request) {
        try {
            HttpSession session = request.getSession();
            //����Session
            session.invalidate();
            return "forward:/admin/login.jsp";
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("msg", "ϵͳ����");
            return "forward:/admin/login.jsp";
        }
        
    }

	
	
	
	
	
	
	
	
	
	

}
