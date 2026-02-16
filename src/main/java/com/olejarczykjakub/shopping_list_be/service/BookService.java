package com.olejarczykjakub.shopping_list_be.service;

import org.springframework.stereotype.Service;

import com.olejarczykjakub.shopping_list_be.dto.request.BookRequestDto;

@Service
public class BookService {
	public String book(BookRequestDto bookRequestDto) {
		String name = bookRequestDto.name();
		return "Name: " + name;
	}
}
