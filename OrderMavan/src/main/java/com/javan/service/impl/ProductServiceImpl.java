package com.javan.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.javan.dao.ProductMapper;
import com.javan.entity.Product;
import com.javan.service.ProductService;
import com.javan.util.PageResult;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductMapper productMapper;

	@Override
	public PageResult<Product> searchProduct(Product product, Integer pageNum, Integer pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		Page<Product> page = productMapper.searchProduct(product);
		PageResult<Product> pageResult = new PageResult<Product>(page.getTotal(), page.getResult());
		return pageResult;
	}

	/*
	 * 新增
	 */
	@Override
	public Integer addProduct(Product product) {
		// TODO Auto-generated method stub
		return productMapper.insert(product);
	}


	/**
	 * 根据id来查询数据
	 */
	@Override
	public Product findById(String id) {
		// TODO Auto-generated method stub
		return productMapper.selectByPrimaryKey(Integer.valueOf(id));
	}


	/*
	 * 编辑数据
	 */
	@Override
	public Integer editProduct(Product product) {
		// TODO Auto-generated method stub
		return productMapper.updateByPrimaryKey(product);
	}

/*
	 * 根据id来删除数据
	 */
	
	@Override
	public Integer deleteById(Integer id) {
		return productMapper.deleteByPrimaryKey(id);
		
	}

	


	

	
	



}
