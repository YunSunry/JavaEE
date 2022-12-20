package com.javan.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.javan.entity.Product;
import com.javan.entity.Worker;
import com.javan.service.WorkerService;
import com.javan.util.PageResult;

@Controller
@RequestMapping("/worker")
public class WorkerController {
	
	@Autowired
	private WorkerService workerService;
	
	@RequestMapping("/search")
	public ModelAndView search(Worker worker,HttpServletRequest request) {
		System.out.println("worker:"+worker);
		
		List<Worker> result = workerService.searchWorkers(worker);
		System.out.println(result);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("pageResult", result);
//		modelAndView.addObject("pageNum",pageNum);
		modelAndView.addObject("search",worker);
		//System.out.println("request.getRequestURI()  :"+request.getRequestURI());
		modelAndView.addObject("gourl",request.getRequestURI());
		modelAndView.setViewName("worker");
		return modelAndView;
		
	}

}
