package com.javan.entity;

public class Category {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.category_id
     *
     * @mbg.generated
     */
    private Integer categoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.category_name
     *
     * @mbg.generated
     */
    private String categoryName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.category_level
     *
     * @mbg.generated
     */
    private String categoryLevel;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.category_id
     *
     * @return the value of category.category_id
     *
     * @mbg.generated
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.category_id
     *
     * @param categoryId the value for category.category_id
     *
     * @mbg.generated
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.category_name
     *
     * @return the value of category.category_name
     *
     * @mbg.generated
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.category_name
     *
     * @param categoryName the value for category.category_name
     *
     * @mbg.generated
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.category_level
     *
     * @return the value of category.category_level
     *
     * @mbg.generated
     */
    public String getCategoryLevel() {
        return categoryLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.category_level
     *
     * @param categoryLevel the value for category.category_level
     *
     * @mbg.generated
     */
    public void setCategoryLevel(String categoryLevel) {
        this.categoryLevel = categoryLevel == null ? null : categoryLevel.trim();
    }
}