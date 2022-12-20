package com.javan.service;

import com.javan.entity.Worker;
import com.javan.util.PageResult;

public interface WorkerService {
	//��ҳ��ѯ
	PageResult<Worker> searchWorkers(Worker worker,Integer pageNum,Integer pageSize);
	
	//����
	Integer addWorker(Worker worker);
	
	
	//����id����ѯ
	Worker findworkerById(String id);
	
	//�޸�
	Integer editWorker(Worker worker);
	
	
	//ɾ��
	Integer deleteById(Integer id);

}
