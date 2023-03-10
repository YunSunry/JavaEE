package com.javan.dao;

import com.github.pagehelper.Page;
import com.javan.entity.Worker;

public interface WorkerMapper {
	
	//??ѯ????
	Page<Worker> searchWorkers(Worker worker);
	
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table worker
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer workerId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table worker
     *
     * @mbg.generated
     */
    int insert(Worker record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table worker
     *
     * @mbg.generated
     */
    int insertSelective(Worker record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table worker
     *
     * @mbg.generated
     */
    Worker selectByPrimaryKey(Integer workerId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table worker
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Worker record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table worker
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Worker record);
}