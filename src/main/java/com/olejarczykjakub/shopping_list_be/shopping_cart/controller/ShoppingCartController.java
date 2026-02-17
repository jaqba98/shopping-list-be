package com.olejarczykjakub.shopping_list_be.shopping_cart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.olejarczykjakub.shopping_list_be.shopping_cart.dto.request.ShoppingCartRequestDto;
import com.olejarczykjakub.shopping_list_be.shopping_cart.dto.response.ShoppingCartResponseDto;
import com.olejarczykjakub.shopping_list_be.shopping_cart.service.ShoppingCartService;

@RestController
public class ShoppingCartController {
	private final ShoppingCartService service;
	
	@Autowired
	public ShoppingCartController(ShoppingCartService service) {
		this.service = service;
	}
	
	@PostMapping("/shopping-cart")
	public ShoppingCartResponseDto shoppingCart(@RequestBody ShoppingCartRequestDto requestDto) {
		return service.shoppingCart(requestDto);
	}
}
