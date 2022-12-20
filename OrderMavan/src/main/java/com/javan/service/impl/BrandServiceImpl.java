package com.javan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.javan.dao.BrandMapper;
import com.javan.entity.Brand;
import com.javan.service.BrandService;
import com.javan.util.PageResult;

@Service
@Transactional
public class BrandServiceImpl implements BrandService {

	@Autowired
	private BrandMapper brandMapper;

	@Override
	public PageResult<Brand> searchBrand(Brand brand, Integer pageNum, Integer pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		Page<Brand> page = brandMapper.searchBrand(brand);
		PageResult<Brand> pageResult = new PageResult<Brand>(page.getTotal(), page.getResult());
		return pageResult;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer addBrand(Brand brand) {
		// TODO Auto-generated method stub
		return brandMapper.insert(brand);
	}

	/**
	 * 根据id来查询数据
	 */
	@Override
	public Brand findByBrId(String id) {
		// TODO Auto-generated method stub
		return brandMapper.selectByPrimaryKey(Integer.valueOf(id));
	}

	/**
	 * 编辑数据
	 */
	@Override
	public Integer editBrand(Brand brand) {
		// TODO Auto-generated method stub
		return brandMapper.updateByPrimaryKey(brand);
	}

	/**
	 * 根据id来删除数据
	 */
	@Override
	public Integer deleteById(Integer id) {
		// TODO Auto-generated method stub
		return brandMapper.deleteByPrimaryKey(id);
	}

}
