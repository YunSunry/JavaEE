package com.cloudlibrary.service;

import java.util.List;

import com.cloudlibrary.domain.Book;
import com.cloudlibrary.entity.PageResult;

public interface BookService {
	//查询可借阅的图书
	PageResult<Book> search(Book book,Integer pageNum,Integer pageSize);
	
	//新增图书
	Integer addBook(Book book);
	
	//根据id查询一条book记录
	Book findById(String id);
	
	//更新图书信息
	Integer editBook(Book book);
	
	//删除图书
	Integer deleteBook(Integer id);



}
