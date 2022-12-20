package com.javan.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.javan.entity.Product;
import com.javan.service.ProductService;
import com.javan.util.PageResult;
import com.javan.util.Result;

@Controller
@RequestMapping("/product")
public class ProductCtroller {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/search")
	public ModelAndView search(Product product,Integer pageNum,Integer pageSize,HttpServletRequest request) {
		System.out.println("product:"+product);
		if(pageNum==null) {
			pageNum=1;
		}
		if(pageSize==null) {
			pageSize=10;
		}
		PageResult<Product> result = productService.searchProduct(product,pageNum,pageSize);
		System.out.println(result);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("pageResult", result);
		modelAndView.addObject("pageNum",pageNum);
		modelAndView.addObject("search",product);
		//System.out.println("request.getRequestURI()  :"+request.getRequestURI());
		modelAndView.addObject("gourl",request.getRequestURI());
		modelAndView.setViewName("product");
		return modelAndView;
		
	}
	
	/**
	 * ����
	 * @param product
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/addproduct")
	public Result addProduct(Product product) {
		try {
			Integer count=productService.addProduct(product);
			System.out.println("count:"+count);	
			if(count!=1) {
				return new Result(false, "��Ӳ�Ʒʧ�ܣ�");
			}
			return new Result(true, "��Ӳ�Ʒ�ɹ�");
		}catch (Exception e) {
			// TODO: handle exception
			return new Result(false, "��Ӳ�Ʒʧ�ܣ�");
		}
				
	}
	
	
	/**
	 * ����id����ѯҪ�޸ĵ�����
	 * @param id
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/findById")
	public Result<Product> findById(String id){
		try {
			Product product=productService.findById(id);
			//System.out.println("book:"+book);	
			if(product == null) {
				return new Result<Product>(false, "�޸Ĳ�Ʒʧ�ܣ�");
			}
			return new Result<Product>(true, "�޸Ĳ�Ʒ�ɹ�",product);
		}catch (Exception e) {
			e.printStackTrace();
			return new Result<Product>(false, "�޸Ĳ�Ʒʧ�ܣ�");
		}	
	}
	
	/**
	 * �޸�
	 * @param product
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/editproduct")
	public Result editProduct(Product product) {
		System.out.println(product);
		try {
			Integer count=productService.editProduct(product);
			System.out.println("count:"+count);	
			if(count!=1) {
				return new Result(false, "�޸Ĳ�Ʒʧ�ܣ�");
			}
			return new Result(true, "�޸Ĳ�Ʒ�ɹ���");
		}catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "�޸Ĳ�Ʒʧ�ܣ�");
		}			
	}
	
	
	/*
	 * ɾ��
	 */
	@ResponseBody
	@RequestMapping("/delproduct")
	public Result<Product> deleteProduct(Integer id) {
		try {
			
//			Integer product = productService.deleteById(id);
			Integer t = productService.deleteById(id);
			if (t==null) {
				return new Result<Product>(false, "ɾ��ʧ��!");
			}
			return new Result<Product>(true, "ɾ���ɹ�!");
		}catch (Exception e) {
			e.printStackTrace();
			return new Result<Product>(false, "ɾ��ʧ��!");
		}
		
	}
	

	
	
	
	

}
