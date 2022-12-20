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
//	����
	@ResponseBody
	@RequestMapping("/addbrand")
	public Result addBrand(Brand brand) {
		try {
			Integer count=brandService.addBrand(brand);
			System.out.println("����count:"+count);	
			if(count!=1) {
				return new Result(false, "��������Ʒ����ʧ�ܣ�");
				
			}
			return new Result(true, "��������Ʒ���̳ɹ�");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new Result(false, "��������Ʒ����ʧ�ܣ�");
		}
		
	}
	
//	����id����ѯҪ�޸ĵ�����
	@ResponseBody
	@RequestMapping("/findByBrId")
	public Result<Brand> findByBrId(String id){
		System.out.println("id="+id);
		try {
			Brand brand=brandService.findByBrId(id);
			System.out.println("��ѯbrand:"+brand);	
			if(brand==null) {
				return new Result<Brand>(false, "��ѯ����Ʒ����ʧ�ܣ�");
				
			}
			return new Result<Brand>(true, "��ѯ����Ʒ���̳ɹ�",brand);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new Result<Brand>(false, "��ѯ����Ʒ����ʧ�ܣ�");
		}
	}
	
//	�޸�
	@ResponseBody
	@RequestMapping("/editBrand")
	public Result editBrand(Brand brand) {
		try {
			Integer count=brandService.editBrand(brand);
			System.out.println("�޸�count:"+count);	
			if(count!=1) {
				return new Result(false, "�޸ĺ���Ʒ����ʧ�ܣ�");
				
			}
			return new Result(true, "�޸ĺ���Ʒ���̳ɹ�");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new Result(false, "�޸ĺ���Ʒ����ʧ�ܣ�");
		}	
	}
	
//	ɾ��
	@ResponseBody
	@RequestMapping("/deleteById")
	public Result<Brand> deleteById(Integer id){
		try {
			Integer brand=brandService.deleteById(id);
			System.out.println("ɾ��brand:"+brand);	
			if(brand==null) {
				return new Result<Brand>(false, "ɾ������Ʒ����ʧ�ܣ�");
				
			}
			return new Result<Brand>(true, "ɾ������Ʒ���̳ɹ�");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new Result<Brand>(false, "ɾ������Ʒ����ʧ�ܣ�");
		}
	}
	
}
