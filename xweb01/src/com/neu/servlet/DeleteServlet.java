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
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		// 从session获取user对象
		User user = (User) session.getAttribute("user");
		// 校验是否登录
		if (user != null) {
			// 1.获取请求地址获取id参数的值
			String id = request.getParameter("id");
			// 2.调用service（）的方法来实现删除功能
			new UserService().deleteUser(id);
			// 重定向到users用户页面
			response.sendRedirect("users");
		} else {
			// 重定向到登录页
			response.sendRedirect("login.jsp");
		}

	}

}
