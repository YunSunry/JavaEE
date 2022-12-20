package com.javan.dao;

import com.javan.entity.Category;

public interface CategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer categoryId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated
     */
    int insert(Category record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated
     */
    int insertSelective(Category record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated
     */
    Category selectByPrimaryKey(Integer categoryId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Category record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Category record);
}