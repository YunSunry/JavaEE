package com.javan.service;

import java.util.List;

import com.javan.entity.Product;
import com.javan.util.PageResult;


public interface ProductService {

	//分页查询
	PageResult<Product> searchProduct(Product product,Integer pageNum,Integer pageSize);
	
	//新增
	Integer addProduct(Product product);
		
		
	//根据id来查询
	Product findById(String id);
		
	//修改
	Integer editProduct(Product product);
		
		
	//删除
	Integer deleteById(Integer id);
}
