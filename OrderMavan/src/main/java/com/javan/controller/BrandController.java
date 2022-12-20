package com.javan.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.javan.entity.Brand;
import com.javan.entity.Product;
import com.javan.service.BrandService;
import com.javan.util.PageResult;
import com.javan.util.Result;

@Controller
@RequestMapping("/brand")
public class BrandController {

	@Autowired
	private BrandService brandService;
	
	@RequestMapping("/search")
	public ModelAndView search(Brand brand,Integer pageNum,Integer pageSize,HttpServletRequest request) {
		System.out.println("brand:"+brand);
		if(pageNum==null) {
			pageNum=1;
		}
		if(pageSize==null) {
			pageSize=10;
		}
		PageResult<Brand> result=brandService.searchBrand(brand, pageNum, pageSize);
		System.out.println(result);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("pageResult", result);
		modelAndView.addObject("pageNum",pageNum);
		modelAndView.addObject("search",brand);
		modelAndView.addObject("gourl",request.getRequestURI());
		modelAndView.setViewName("brand");
		return modelAndView;
	}
//	新增
	@ResponseBody
	@RequestMapping("/addbrand")
	public Result addBrand(Brand brand) {
		try {
			Integer count=brandService.addBrand(brand);
			System.out.println("新增count:"+count);	
			if(count!=1) {
				return new Result(false, "新增合作品牌商失败！");
				
			}
			return new Result(true, "新增合作品牌商成功");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new Result(false, "新增合作品牌商失败！");
		}
		
	}
	
//	根据id来查询要修改的数据
	@ResponseBody
	@RequestMapping("/findByBrId")
	public Result<Brand> findByBrId(String id){
		System.out.println("id="+id);
		try {
			Brand brand=brandService.findByBrId(id);
			System.out.println("查询brand:"+brand);	
			if(brand==null) {
				return new Result<Brand>(false, "查询合作品牌商失败！");
				
			}
			return new Result<Brand>(true, "查询合作品牌商成功",brand);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new Result<Brand>(false, "查询合作品牌商失败！");
		}
	}
	
//	修改
	@ResponseBody
	@RequestMapping("/editBrand")
	public Result editBrand(Brand brand) {
		try {
			Integer count=brandService.editBrand(brand);
			System.out.println("修改count:"+count);	
			if(count!=1) {
				return new Result(false, "修改合作品牌商失败！");
				
			}
			return new Result(true, "修改合作品牌商成功");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new Result(false, "修改合作品牌商失败！");
		}	
	}
	
//	删除
	@ResponseBody
	@RequestMapping("/deleteById")
	public Result<Brand> deleteById(Integer id){
		try {
			Integer brand=brandService.deleteById(id);
			System.out.println("删除brand:"+brand);	
			if(brand==null) {
				return new Result<Brand>(false, "删除合作品牌商失败！");
				
			}
			return new Result<Brand>(true, "删除合作品牌商成功");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new Result<Brand>(false, "删除合作品牌商失败！");
		}
	}
	
}
