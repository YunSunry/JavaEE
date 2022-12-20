package com.javan.service;

import com.javan.entity.Category;
import com.javan.util.PageResult;

public interface CategoryService {
//分页查询
	PageResult<Category> searchCategory(Category category,Integer pageNum,Integer pageSize);
	//新增
	Integer addCategory(Category category);
	//根据id查询
	Category findById(String id);
	//修改
	Integer editCategory(Category category);
	//删除
	void deleteById(Integer id);
}
