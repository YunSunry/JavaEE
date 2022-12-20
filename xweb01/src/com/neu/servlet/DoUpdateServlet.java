package com.neu.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.neu.bean.User;
import com.neu.service.UserService;

/**
 * Servlet implementation class DoUpdateServlet
 */
@WebServlet("/doupdate")
public class DoUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 获取session对象
		HttpSession session = request.getSession();
		// 从session获取user对象
		User u = (User) session.getAttribute("user");
		// 校验是否登录
		if (u != null) {
			// 1 获取页面上提交的表单数据
			String id = request.getParameter("id");
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			// 调用service方法更新数据库
			new UserService().updateUser(id, username, password);
			// 3.重定向到users servlet
			response.sendRedirect("users");
		} else {
			// 重定向到登录页
			response.sendRedirect("login.jsp");
		}
	}

}
