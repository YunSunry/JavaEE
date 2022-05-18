package com.cloudlibrary.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cloudlibrary.dao.BookMapper;
import com.cloudlibrary.domain.Book;
import com.cloudlibrary.service.BookService;

@Service
@Transactional
public class BookServiceImpl implements BookService {
	@Autowired
	private BookMapper bookMapper;

	@Override
	public List<Book> search(Book book) {
		// TODO Auto-generated method stub
		return bookMapper.searchBook(book);
	}
	

}
