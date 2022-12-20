package com.javan.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.javan.entity.Category;

import com.javan.service.CategoryService;
import com.javan.util.PageResult;
import com.javan.util.Result;

@Controller
@RequestMapping("/category")
public class CategoryController {
	@Autowired
	private CategoryService categoryService;
	@RequestMapping("/search")
	public ModelAndView search(Category category,Integer pageNum,Integer pageSize,HttpServletRequest request) {
		System.out.println("category:"+category);
		if(pageNum==null) {
			pageNum=1;
		}
		if(pageSize==null) {
			pageSize=10;
		}
		PageResult<Category> result = categoryService.searchCategory(category, pageNum, pageSize);
		System.out.println(result);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("pageResult", result);
		modelAndView.addObject("pageNum",pageNum);
		modelAndView.addObject("search",category);
		modelAndView.addObject("gourl",request.getRequestURI());
		modelAndView.setViewName("category");
		return modelAndView;
	}
	
	/**
	 * 新增
	 * @param category
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/addcategory")
	public Result addCategory(Category category) {
		try {
			Integer count=categoryService.addCategory(category);
			System.out.println("count:"+count);	
			if(count!=1) {
				return new Result(false, "添加失败！");
			}return new Result(true, "添加成功");
			
		} catch (Exception e) {
			// TODO: handle exception
			return new Result(false, "添加失败！");
		}
		
		
	}
	

	
	/**
	 * 根据id来查询要修改的数据
	 * @param id
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/findById")
	public Result<Category> findById(String id){
		try {
			Category category = categoryService.findById(id);
			if(category == null) {
				return new Result<Category>(false, "查询成功！");
			}
			return new Result<Category>(true, "查询成功",category);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new Result<Category>(false, "查询菜品成功！");
		}
	}
	
	/**
	 * 修改
	 * @param category
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/editcategory")
	public Result editCategory(Category category) {
		System.out.println(category);
		try {
			Integer count=categoryService.editCategory(category);
			System.out.println("count:"+count);	
			if(count!=1) {
				return new Result(false, "修改菜品失败！");
			}
			return new Result(true, "修改菜品成功！");
		}catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改菜品失败！");
		}			
	}
	
	/*
	 * 删除
	 */
	@ResponseBody
	@RequestMapping("/delcategory")	
	public Result deleteCaregory(Integer id) {
		try {
			categoryService.deleteById(id);
			return new Result(true, "删除成功!");
		}catch (Exception e) {
			e.printStackTrace();
			categoryService.deleteById(id);
			return new Result(true, "删除失败!");
		}

}

}
