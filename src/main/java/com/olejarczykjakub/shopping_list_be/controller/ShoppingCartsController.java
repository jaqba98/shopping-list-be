package com.olejarczykjakub.shopping_list_be.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingCartsController {
	@PostMapping("/shopping-carts")
	public String createShoppingCart() {
		return "The shopping cart was created!";
	}
	
	@GetMapping("/shopping-carts")
	public String readShoppingCarts() {
		return "The shopping carts were readed!";
	}
	
	@GetMapping("/shopping-carts/{shoppingCartId}")
	public String readShoppingCart(@PathVariable Long shoppingCartId) {
		return "The shopping cart with id: " + shoppingCartId + " was readed!";
	}
	
	@PutMapping("/shopping-carts/{shoppingCartId}")
	public String updateShoppingCart(@PathVariable Long shoppingCartId) {
		return "The shopping cart with id: " + shoppingCartId + " was updated!";
	}
	
	@DeleteMapping("/shopping-carts/{shoppingCartId}")
	public String deleteShoppingCart(@PathVariable Long shoppingCartId) {
		return "The shopping cart with id: " + shoppingCartId + " was deleted!";
	}
}
