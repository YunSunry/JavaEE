package com.cloudlibrary.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cloudlibrary.domain.Book;
import com.cloudlibrary.entity.PageResult;
import com.cloudlibrary.entity.Result;
import com.cloudlibrary.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@RequestMapping("/search")
	public ModelAndView search(Book book,Integer pageNum,Integer pageSize,HttpServletRequest request ) {
		//�����б���book�����ֵ������books.jspҳ���ϵĲ�ѯ���ύ�Ĳ�ѯ����
		System.out.println("book:"+book);
		if (pageNum==null) {
			pageNum=1;
		}
		if (pageSize==null) {
			//��ÿҳ��ʾ���� ��1�����ڶ���src/main/webapp/js/my.js�����315��pageSize��
			pageSize=10;
		}
		//��ҳ3.��ѯ���ѷ�ҳ��ͼ����Ϣ
		PageResult<Book> result=bookService.search(book,pageNum,pageSize);
		System.out.println(result);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("pageResult", result);
		modelAndView.addObject("pageNum",pageNum);
		modelAndView.addObject("search",book);
//		System.out.println("request.getRequestURI():"+request.getRequestURI());
		modelAndView.addObject("gourl",request.getRequestURI());
		modelAndView.setViewName("books");
		return modelAndView;
	}
	
	
	/**
	 * �������
	 * @param book
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/addBook")
	public Result addBook(Book book) {
		try {
			Integer count = bookService.addBook(book);
			System.out.println("count:" + count);
			if (count!=1) {
				return new Result(false, "����ͼ��ʧ��!");
			}
			return new Result(true, "����ͼ��ɹ�");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "����ͼ��ʧ��!");
		}
	}
	
	
	/**
	 * ����id��ѯ����
	 * @param id
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/findById")
	public Result<Book> findById(String id){
		try {
			Book book = bookService.findById(id);
			System.out.println("book:" + book);
			if (book == null) {
				return new Result<Book>(false, "��ѯͼ��ʧ��!");
			}
			return new Result<Book>(true, "��ѯͼ��ɹ�",book);
		} catch (Exception e) {
			e.printStackTrace();
			return new Result<Book>(false, "��ѯͼ��ʧ��!");
		}
	}
	
	/**
	 * �༭ͼ��
	 * @param book
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/editBook")
	public Result editBook(Book book) {
		try {
			Integer count = bookService.editBook(book);
			System.out.println("count:" + count);
			if (count!=1) {
				return new Result(false, "����ͼ��ʧ��!");
			}
			return new Result(true, "����ͼ��ɹ�");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "����ͼ��ʧ��!");
		}
	}
	
	@ResponseBody
	@RequestMapping("/deleteBook")
	public Result<Book> deleteBook(Integer id){
		try {
			Integer book = bookService.deleteBook(id);
			System.out.println("book:" + book);
			if (book == null) {
				return new Result<Book>(false, "ɾ��ʧ��");
			}
			return new Result<Book>(true, "ɾ���ɹ�");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result<Book>(false, "ɾ��ʧ��");
		}
	}
	
	
	
}
