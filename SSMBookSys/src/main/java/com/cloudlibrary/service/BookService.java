package com.cloudlibrary.service;

import java.util.List;

import com.cloudlibrary.domain.Book;

public interface BookService {
	List<Book> search(Book book);

}
