package com.javan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.javan.dao.CategoryMapper;
import com.javan.entity.Category;
import com.javan.service.CategoryService;
import com.javan.util.PageResult;


@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryMapper categoryMapper;

	@Override
	public PageResult<Category> searchCategory(Category category, Integer pageNum, Integer pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum,pageSize);
		Page<Category> page = categoryMapper.searchCategory(category);
		PageResult<Category> pageResult = new PageResult<Category>(page.getTotal(), page.getResult());
		return pageResult;
	}
	/*
	 * ����
	 * */

	@Override
	public Integer addCategory(Category category) {
		// TODO Auto-generated method stub
		return categoryMapper.insert(category);
	}
	/**
	 * ����id����ѯ����
	 */
	@Override
	public Category findById(String id) {
		// TODO Auto-generated method stub
		return categoryMapper.selectByPrimaryKey(Integer.valueOf(id));
	}
	/*
	 * �༭����
	 */
	@Override
	public Integer editCategory(Category category) {
		// TODO Auto-generated method stub
		return categoryMapper.updateByPrimaryKey(category);
	}
	/*
	 * ����id��ɾ������
	 */
	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		categoryMapper.deleteByPrimaryKey(id);

	}

}
