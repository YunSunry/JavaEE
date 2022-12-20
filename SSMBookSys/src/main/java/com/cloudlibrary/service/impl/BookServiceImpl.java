package com.cloudlibrary.service.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.javassist.expr.NewArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cloudlibrary.dao.BookMapper;
import com.cloudlibrary.domain.Book;
import com.cloudlibrary.entity.PageResult;
import com.cloudlibrary.service.BookService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Service
@Transactional
public class BookServiceImpl implements BookService {
	@Autowired
	private BookMapper bookMapper;

	@Override
	public PageResult<Book> search(Book book, Integer pageNum, Integer pageSize) {
		// ��ҳ2.���÷�ҳ��ѯ��������ʼ��ҳ(�����������˳�򲻿ɵߵ�)
		PageHelper.startPage(pageNum, pageSize);
		Page<Book> page = bookMapper.searchBook(book);
		PageResult<Book> pageResult = new PageResult<Book>(page.getTotal(), page.getResult());
		return pageResult;
	}

	/**
	 * ����ͼ��
	 * 
	 * @param book ҳ���ύ������ͼ����Ϣ
	 * @return ����������¼��
	 */
	@Override
	public Integer addBook(Book book) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		book.setBookUploadtime(dateFormat.format(new Date()));
		return bookMapper.insert(book);
	}

	/**
	 * ����id��ѯһ��book��¼
	 * 
	 * @param ͼ��id
	 */
	@Override
	public Book findById(String id) {
		return bookMapper.selectByPrimaryKey(Integer.valueOf(id));
	}

	@Override
	public Integer editBook(Book book) {
		return bookMapper.updateByPrimaryKeySelective(book);
	}

	@Override
	public Integer deleteBook(Integer id) {
		// TODO Auto-generated method stub
		return bookMapper.deleteByPrimaryKey(id);
	}

	

	
}
