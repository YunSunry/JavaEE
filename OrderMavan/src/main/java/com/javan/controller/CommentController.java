package com.javan.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.javan.dao.CommentMapper;
import com.javan.entity.Comment;
import com.javan.entity.Product;
import com.javan.service.CommentService;
import com.javan.util.PageResult;

@Controller
@RequestMapping("/comment")
public class CommentController {
	
	@Autowired
	private CommentService commentService;
	
	
	@RequestMapping("/search")
	public ModelAndView search(Comment comment,Integer pageNum,Integer pageSize,HttpServletRequest request) {
		System.out.println("comment:"+comment);
		if(pageNum==null) {
			pageNum=1;
		}
		if(pageSize==null) {
			pageSize=10;
		}
		PageResult<Comment> result = commentService.searchComment(comment,pageNum,pageSize);
		System.out.println(result);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("pageResult", result);
		modelAndView.addObject("pageNum",pageNum);
		modelAndView.addObject("search",comment);
		//System.out.println("request.getRequestURI()  :"+request.getRequestURI());
		modelAndView.addObject("gourl",request.getRequestURI());
		modelAndView.setViewName("comment");
		return modelAndView;
		
	}

}
