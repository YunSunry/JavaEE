package com.javan.service;

import java.util.List;

import com.javan.entity.Worker;
import com.javan.util.PageResult;

public interface WorkerService {
	//��ҳ��ѯ
	List<Worker> searchWorkers(Worker worker);
}
