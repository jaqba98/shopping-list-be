package com.olejarczykjakub.shopping_list_be.shopping_cart.service;

import org.springframework.stereotype.Service;

import com.olejarczykjakub.shopping_list_be.shopping_cart.dto.request.ShoppingCartRequestDto;
import com.olejarczykjakub.shopping_list_be.shopping_cart.dto.response.ShoppingCartResponseDto;

@Service
public class ShoppingCartService {
	public ShoppingCartResponseDto shoppingCart(ShoppingCartRequestDto requestDto) {
		String name = requestDto.name();
		return new ShoppingCartResponseDto(name);
	}
}
