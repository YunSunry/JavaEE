package com.neu.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.neu.bean.User;
import com.neu.service.UserService;

/**
 * 登录Servlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

       

	/**
	 * 登录验证
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//代码编写处
		//1.从前端获取数据
		String userName=request.getParameter("userName"); //从前端jsp页面获取数据要用getParameter方法
		String password=request.getParameter("password");
		//2.使用service获取对象
		UserService service=new UserService();
		User user=service.getUser(userName, password);
		if (user!=null) {
			HttpSession session=request.getSession();
			session.setAttribute("user", user);
			//重定向到users servlet
			response.sendRedirect("users");
		}else {
			response.sendRedirect("login.jsp");
		}
		
	}

}
