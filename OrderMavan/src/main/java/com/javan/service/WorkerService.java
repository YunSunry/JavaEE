package com.javan.service;

import com.javan.entity.Worker;
import com.javan.util.PageResult;

public interface WorkerService {
	//分页查询
	PageResult<Worker> searchWorkers(Worker worker,Integer pageNum,Integer pageSize);
	
	//新增
	Integer addWorker(Worker worker);
	
	
	//根据id来查询
	Worker findworkerById(String id);
	
	//修改
	Integer editWorker(Worker worker);
	
	
	//删除
	Integer deleteById(Integer id);

}
