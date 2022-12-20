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
		//参数列表中book对象的值，来自books.jsp页面上的查询表单提交的查询数据
		System.out.println("book:"+book);
		if (pageNum==null) {
			pageNum=1;
		}
		if (pageSize==null) {
			//改每页显示数据 第1步（第二改src/main/webapp/js/my.js里面的315行pageSize）
			pageSize=10;
		}
		//分页3.查询到已分页的图书信息
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
	 * 添加数据
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
				return new Result(false, "新增图书失败!");
			}
			return new Result(true, "新增图书成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "新增图书失败!");
		}
	}
	
	
	/**
	 * 根据id查询数据
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
				return new Result<Book>(false, "查询图书失败!");
			}
			return new Result<Book>(true, "查询图书成功",book);
		} catch (Exception e) {
			e.printStackTrace();
			return new Result<Book>(false, "查询图书失败!");
		}
	}
	
	/**
	 * 编辑图书
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
				return new Result(false, "更新图书失败!");
			}
			return new Result(true, "更新图书成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "更新图书失败!");
		}
	}
	
	@ResponseBody
	@RequestMapping("/deleteBook")
	public Result<Book> deleteBook(Integer id){
		try {
			Integer book = bookService.deleteBook(id);
			System.out.println("book:" + book);
			if (book == null) {
				return new Result<Book>(false, "删除失败");
			}
			return new Result<Book>(true, "删除成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result<Book>(false, "删除失败");
		}
	}
	
	
	
}
