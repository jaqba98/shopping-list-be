package com.olejarczykjakub.shopping_list_be.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.olejarczykjakub.shopping_list_be.dto.request.BookRequestDto;
import com.olejarczykjakub.shopping_list_be.service.BookService;

@RestController
public class BookController {
	private final BookService bookService;
	
	@Autowired
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	
	@PostMapping("/book")
	public String book(@RequestBody BookRequestDto bookRequestDto) {
		return bookService.book(bookRequestDto);
	}
}
