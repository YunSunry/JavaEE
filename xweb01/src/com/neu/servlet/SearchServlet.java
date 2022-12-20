package com.neu.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.neu.bean.User;
import com.neu.service.UserService;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/search")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 获取session对象
		HttpSession session = request.getSession();
		// 从session获取user对象
		User u = (User) session.getAttribute("user");
		// 校验是否登录
		if (u != null) {
			//获取地址参数的值
			String username = request.getParameter("username");
			//调用service来更新数据库
			List<User> list = new UserService().searchByUserName(username);
			//请求转发到search.jsp
			request.setAttribute("userList", list);
			request.getRequestDispatcher("search.jsp").forward(request, response);
				
			
		} else {
			// 重定向到登录页
			response.sendRedirect("login.jsp");
		}
	}

}
