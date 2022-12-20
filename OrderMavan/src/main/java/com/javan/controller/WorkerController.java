package com.javan.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.javan.entity.Product;
import com.javan.entity.Worker;
import com.javan.service.WorkerService;
import com.javan.util.PageResult;
import com.javan.util.Result;

@Controller
@RequestMapping("/worker")
public class WorkerController {
	@Autowired
	private WorkerService workerService;

	@RequestMapping("/search")
	public ModelAndView search(Worker worker, Integer pageNum, Integer pageSize, HttpServletRequest request) {
		System.out.println("worker:" + worker);
		if (pageNum == null) {
			pageNum = 1;
		}
		if (pageSize == null) {
			pageSize = 10;
		}
		PageResult<Worker> result = workerService.searchWorkers(worker, pageNum, pageSize);
		System.out.println(result);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("pageResult", result);
		modelAndView.addObject("pageNum", pageNum);
		modelAndView.addObject("search", worker);
		// System.out.println("request.getRequestURI() :"+request.getRequestURI());
		modelAndView.addObject("gourl", request.getRequestURI());
		modelAndView.setViewName("worker2");
		return modelAndView;

	}

	/**
	 * ����
	 * 
	 * @param product
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/addWorker")
	public Result addWorker(Worker worker) {
		try {
			Integer count = workerService.addWorker(worker);
			System.out.println("count:" + count);
			if (count != 1) {
				return new Result(false, "���Ա��ʧ�ܣ�");
			}
			return new Result(true, "���Ա���ɹ�");
		} catch (Exception e) {
			// TODO: handle exception
			return new Result(false, "���Ա��ʧ�ܣ�");
		}

	}

	/**
	 * ��ѯid
	 * @param id
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/findworkerById")
	public Result<Worker> findworkerById(String id) {
		try {
			Worker worker = workerService.findworkerById(id);
			if (worker == null) {
				return new Result<Worker>(false, "�޸�ʧ��");
			}
			return new Result<Worker>(true, "�޸ĳɹ�",worker);
		} catch (Exception e) {
			e.printStackTrace();
			return new Result<Worker>(false, "�޸�ʧ��");
		}
	}
	
	
	/**
	 * �༭�û���Ϣ
	 * @param worker
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/editWorker")
	public Result editWorker(Worker worker) {
		System.out.println(worker);
		try {
			Integer count=workerService.editWorker(worker);
			System.out.println("count:"+count);	
			if(count!=1) {
				return new Result(false, "�޸�Ա����Ϣʧ��");
			}
			return new Result(true, "�޸�Ա����Ϣ�ɹ���");
		}catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "�޸�Ա����Ϣʧ�ܣ�");
		}			
	}
	
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/delworker")
	public Result<Worker> deleteById(Integer id) {
		try {
			Integer workerId = workerService.deleteById(id);
			if (workerId == null) {
				return new Result<Worker>(true, "ɾ��ʧ��!");
			}
			return new Result<Worker>(true, "ɾ���ɹ�!");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result<Worker>(true, "ɾ��ʧ��!");
		}

	}

}
