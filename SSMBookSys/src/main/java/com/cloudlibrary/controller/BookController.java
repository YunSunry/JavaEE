package com.cloudlibrary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cloudlibrary.domain.Book;
import com.cloudlibrary.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	private BookService  bookService;
	
	@RequestMapping("/search")
	public ModelAndView search(Book book) {
		List<Book> result=bookService.search(book);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("result", result);
		modelAndView.setViewName("books");
		return modelAndView;
	}
}
