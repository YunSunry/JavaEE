package com.javan.interceptor;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.javan.entity.User;

public class ResourcesInterceptor extends HandlerInterceptorAdapter {
	
	//从配置文件文件中读取出，允许普通用户访问的地址
	@Value("#{'${ignore.url}'.split(',')}")
	private List<String> ignoreUrl;
	
	//private String ignoreUrlStr="/logout,/selectNewbooks,/findById,/borrowBook,/search,/searchBorrowed,/returnBook,/searchRecords";
	
	

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("preHandle()");
		System.out.println(ignoreUrl);
		//获取session中用户
		User user=(User) request.getSession().getAttribute("USER_SESSION");
		//获取请求的地址路径
		String uri=request.getRequestURI();
		System.out.println("uri:"+uri);
		//如果用户已经登录，判断用户的访问是否有权限
		if(user !=null) {
			//如果是管理员，放行
			if("ADMIN".equals(user.getUserRole())){
				return true;
			}else if("USER".equals(user.getUserRole())) {
				for(String url:ignoreUrl) {
					//访问的地址在ignoreUrl集合范围里，放行
					if(uri.indexOf(url)>=0) {
						return true;
					}
				}
			}
		}
		
		//用户请求登录时，放行
		if(uri.indexOf("/login")>=0) {
			return true;
		}
		
		request.setAttribute("message", "您还没有登录，请先登录！");
		request.getRequestDispatcher("/admin/login.jsp").forward(request, response);
		
		return false;
	}
	
}
