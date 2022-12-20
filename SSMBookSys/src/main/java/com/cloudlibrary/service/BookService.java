package com.cloudlibrary.service;

import java.util.List;

import com.cloudlibrary.domain.Book;
import com.cloudlibrary.entity.PageResult;

public interface BookService {
	//��ѯ�ɽ��ĵ�ͼ��
	PageResult<Book> search(Book book,Integer pageNum,Integer pageSize);
	
	//����ͼ��
	Integer addBook(Book book);
	
	//����id��ѯһ��book��¼
	Book findById(String id);
	
	//����ͼ����Ϣ
	Integer editBook(Book book);
	
	//ɾ��ͼ��
	Integer deleteBook(Integer id);



}
