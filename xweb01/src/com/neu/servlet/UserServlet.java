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
 * 用户管理Servlet
 */
@WebServlet("/users")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * 1、登录session验证 2、显示所有用户信息
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 代码编写处

//		// 获取session对象
//		HttpSession session = request.getSession();
//		//从session获取user对象
//		User user = (User) session.getAttribute("user");
//		//校验是否登录
//		if (user != null) {
//			UserService service = new UserService();
//			List<User> list = service.getUsers();
//			request.setAttribute("userList", list);
//			// 请求转发到jsp页面
//			request.getRequestDispatcher("users.jsp").forward(request, response);
//		}else {
//			//重定向到登录页
//			response.sendRedirect("login.jsp");
//		}
		
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		if (user!=null) {
			//实例化service层
			UserService service = new UserService();
			List<User> list = service.getUsers();
			request.setAttribute("userList", list);
			//把请求转发到jsp页面
			request.getRequestDispatcher("users.jsp").forward(request, response);
		}else {
			response.sendRedirect("login.jsp");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
