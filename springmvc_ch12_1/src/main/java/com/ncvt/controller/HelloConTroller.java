package com.ncvt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * RequestMapping����
 * @author wu
 *
 */
@Controller
@RequestMapping("/hello1")		//���������ϵ�ӳ�����һ��Ŀ¼
public class HelloConTroller {
	
	@RequestMapping("/index")
	public String index() {
		System.out.print("ִ����index()");
		return "jsp/hello";
	};
	
	
	//ӳ�䷽��û�зŻ�ֵ������£����ӳ���ַ�Զ����ϡ�jsp��׺
	@RequestMapping("/hello")
	public void index1() {
		System.out.print("ִ����index1()");	
	};
	
	
	
//	@RequestMapping("hello1") ��@RequestMapping(value="/hello1")�ļ�д��ʽ������Ч����ȫ��ͬ
	@RequestMapping(value="/hello1")
	public String hello1() {
		System.out.println("hello()1�ķ�����������");
		return "jsp/hello";
	}
	
	
	@RequestMapping(value="/hello2",method = RequestMethod.GET)
	public String hello2() {
		System.out.println("hello2()�ķ�����������");
		return "jsp/hello";
	}
	
	
	//���ʵ�ַ  /hello1/hello3?p1=aa �����б���p1���ܽ��ܵ�ǰ���ύ�Ĳ���ֵ
	@RequestMapping(value="/hello3")
	public String hello3(String p1) {
		System.out.println("hello3()�ķ�����������,P1="+p1);
		return "jsp/hello";
	}
	
	//����params = {"p1"}���������û���ṩp1�������磺/hello1/hello4 400��������󷽷� ���ʾͻᱨ��
	@RequestMapping(value="/hello4",params = {"p1"})
	public String hello4(String p1) {
		System.out.println("hello4()�ķ�����������,p1="+p1);
		return "jsp/hello";
	}
	

}
