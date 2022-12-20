package com.javan.service.impl;

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
	public PageResult<Worker> searchWorkers(Worker worker, Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		Page<Worker> page = workerMapper.searchWorkers(worker);
		PageResult<Worker> pageResult = new PageResult<Worker>(page.getTotal(), page.getResult());
		// TODO Auto-generated method stub
		return pageResult;
	}

	
	/**
	 * ����
	 */
	@Override
	public Integer addWorker(Worker worker) {
		// TODO Auto-generated method stub
		
		return workerMapper.insert(worker);
	}

	/**
	 * ����id����ѯ
	 */
	@Override
	public Worker findworkerById(String id) {
		// TODO Auto-generated method stub
		return workerMapper.selectByPrimaryKey(Integer.valueOf(id));
	}
	
	
	/**
	 * �޸�
	 */
	@Override
	public Integer editWorker(Worker worker) {
		// TODO Auto-generated method stub
		return workerMapper.updateByPrimaryKey(worker);
	}

	/**
	 * ɾ��
	 * @return 
	 */
	@Override
	public Integer deleteById(Integer id) {
		return workerMapper.deleteByPrimaryKey(id);
		
	}

}
