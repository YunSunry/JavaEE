package com.javan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.javan.dao.WorkerMapper;
import com.javan.entity.Worker;
import com.javan.service.WorkerService;
import com.javan.util.PageResult;


@Service
@Transactional
public class WorkerServiceImpl implements WorkerService {
	
	
	@Autowired
	private WorkerMapper workerMapper;

	@Override
	public List<Worker> searchWorkers(Worker worker) {
		// TODO Auto-generated method stub
		
		List<Worker> resultList = workerMapper.searchWorkers(worker);
		return resultList;
	}

}
