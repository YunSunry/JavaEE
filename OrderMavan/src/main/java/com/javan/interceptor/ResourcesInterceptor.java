package com.javan.interceptor;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.javan.entity.User;

public class ResourcesInterceptor extends HandlerInterceptorAdapter {
	
	//�������ļ��ļ��ж�ȡ����������ͨ�û����ʵĵ�ַ
	@Value("#{'${ignore.url}'.split(',')}")
	private List<String> ignoreUrl;
	
	//private String ignoreUrlStr="/logout,/selectNewbooks,/findById,/borrowBook,/search,/searchBorrowed,/returnBook,/searchRecords";
	
	

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("preHandle()");
		System.out.println(ignoreUrl);
		//��ȡsession���û�
		User user=(User) request.getSession().getAttribute("USER_SESSION");
		//��ȡ����ĵ�ַ·��
		String uri=request.getRequestURI();
		System.out.println("uri:"+uri);
		//����û��Ѿ���¼���ж��û��ķ����Ƿ���Ȩ��
		if(user !=null) {
			//����ǹ���Ա������
			if("ADMIN".equals(user.getUserRole())){
				return true;
			}else if("USER".equals(user.getUserRole())) {
				for(String url:ignoreUrl) {
					//���ʵĵ�ַ��ignoreUrl���Ϸ�Χ�����
					if(uri.indexOf(url)>=0) {
						return true;
					}
				}
			}
		}
		
		//�û������¼ʱ������
		if(uri.indexOf("/login")>=0) {
			return true;
		}
		
		request.setAttribute("message", "����û�е�¼�����ȵ�¼��");
		request.getRequestDispatcher("/admin/login.jsp").forward(request, response);
		
		return false;
	}
	
}
