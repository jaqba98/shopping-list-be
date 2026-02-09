package com.olejarczykjakub.shopping_list_be.service;

import org.springframework.stereotype.Service;

@Service
public class ShoppingCartsService {
	public String createShoppingCart() {
		return "The shopping cart was created!";
	}
	
	public String readShoppingCarts() {
		return "The shopping carts were readed!";
	}
	
	public String readShoppingCart(Long shoppingCartId) {
		return "The shopping cart with id: " + shoppingCartId + " was readed!";
	}
	
	public String updateShoppingCart(Long shoppingCartId) {
		return "The shopping cart with id: " + shoppingCartId + " was updated!";
	}
	
	public String deleteShoppingCart(Long shoppingCartId) {
		return "The shopping cart with id: " + shoppingCartId + " was deleted!";
	}
}
