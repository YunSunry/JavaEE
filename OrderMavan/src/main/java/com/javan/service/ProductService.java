package com.javan.service;

import java.util.List;

import com.javan.entity.Product;
import com.javan.util.PageResult;


public interface ProductService {

	//��ҳ��ѯ
	PageResult<Product> searchProduct(Product product,Integer pageNum,Integer pageSize);
	
	//����
	Integer addProduct(Product product);
		
		
	//����id����ѯ
	Product findById(String id);
		
	//�޸�
	Integer editProduct(Product product);
		
		
	//ɾ��
	Integer deleteById(Integer id);
}
