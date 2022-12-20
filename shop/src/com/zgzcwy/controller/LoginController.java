package com.zgzcwy.controller;

import com.zgzcwy.entity.User;
import com.zgzcwy.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * @ClassName:  LoginController   
 * @Description:  用户登录登出
 * @author: Administrator  
 * @date:   2018年1月5日 上午11:37:06   
 *
 */
@Controller
public class LoginController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private LoginService loginService;
	/**
	 * 登录
	 * @param mav
	 * @param username
	 * @param password
	 * @param checkCode
	 * @param session
	 * @return
	 */
	@RequestMapping("/login")
	public ModelAndView login(
			ModelAndView mav,
			String username,
			String password,
			String checkCode,
			HttpSession session){
		logger.info("用户名"+username);
		logger.info("密码"+password);
		//1.比较验证码
	    String sessionCode=(String) session.getAttribute("checkCode");
	    if(checkCode!=null&&checkCode.equalsIgnoreCase(sessionCode)){
	    	logger.info("验证码："+checkCode);
	    	//登录操作
	    	User user=loginService.findUserByUsernaeAndPassword(username,password);
	    	logger.info("user"+user);
	    	if(user!=null){
	    	//验证用户状态
	    		int status=user.getStatus();
	    		if(status==1){
	    			session.setAttribute("user",user);
	    			mav.setViewName("redirect:index");
	    			logger.info("登录成功");
	    			return mav;
	    		}else{
	    			mav.addObject("msg","请联系管理员");
	    			mav.setViewName("login");
	    			return mav;
	    		}
	    	}else{
	    		mav.addObject("msg","用户名或者密码错误");
	    		mav.setViewName("login");
	    		return mav;
	    	}
	    }else{
	    	mav.addObject("msg","验证码错误");
	    	mav.setViewName("login");
	    	return mav;
	    }
	}
	/**
	 * 登出
	 */
	@RequestMapping("/logout")
	public String logout(HttpSession session){
		//销毁session
		session.invalidate();
		return "redirect:index";
	}
}
