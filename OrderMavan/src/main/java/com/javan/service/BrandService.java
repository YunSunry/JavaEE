package com.javan.service;

import com.javan.entity.Brand;
import com.javan.util.PageResult;

public interface BrandService {
	//分页查询
	PageResult<Brand> searchBrand(Brand brand,Integer pageNum,Integer pageSize);
	//新增
	Integer addBrand(Brand brand);
	//根据id来查询
	Brand findByBrId(String id);
	//修改
	Integer editBrand(Brand brand);
	//删除
	Integer deleteById(Integer id);
}
