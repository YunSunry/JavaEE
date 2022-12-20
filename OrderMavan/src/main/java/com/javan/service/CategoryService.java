package com.javan.service;

import com.javan.entity.Category;
import com.javan.util.PageResult;

public interface CategoryService {
//��ҳ��ѯ
	PageResult<Category> searchCategory(Category category,Integer pageNum,Integer pageSize);
	//����
	Integer addCategory(Category category);
	//����id��ѯ
	Category findById(String id);
	//�޸�
	Integer editCategory(Category category);
	//ɾ��
	void deleteById(Integer id);
}
