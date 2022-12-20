package com.javan.service;

import com.javan.entity.Brand;
import com.javan.util.PageResult;

public interface BrandService {
	//��ҳ��ѯ
	PageResult<Brand> searchBrand(Brand brand,Integer pageNum,Integer pageSize);
	//����
	Integer addBrand(Brand brand);
	//����id����ѯ
	Brand findByBrId(String id);
	//�޸�
	Integer editBrand(Brand brand);
	//ɾ��
	Integer deleteById(Integer id);
}
