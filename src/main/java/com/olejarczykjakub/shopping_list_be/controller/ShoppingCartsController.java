package com.olejarczykjakub.shopping_list_be.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olejarczykjakub.shopping_list_be.service.ShoppingCartsService;

@RestController
public class ShoppingCartsController {
	private final ShoppingCartsService shoppingCartsService;
	
	@Autowired
	public ShoppingCartsController(ShoppingCartsService shoppingCartsService) {
		this.shoppingCartsService = shoppingCartsService;
	}
	
	@PostMapping("/shopping-carts")
	public String createShoppingCart() {
		return shoppingCartsService.createShoppingCart();
	}
	
	@GetMapping("/shopping-carts")
	public String readShoppingCarts() {
		return shoppingCartsService.readShoppingCarts();
	}
	
	@GetMapping("/shopping-carts/{shoppingCartId}")
	public String readShoppingCart(@PathVariable Long shoppingCartId) {
		return shoppingCartsService.readShoppingCart(shoppingCartId);
	}
	
	@PutMapping("/shopping-carts/{shoppingCartId}")
	public String updateShoppingCart(@PathVariable Long shoppingCartId) {
		return shoppingCartsService.updateShoppingCart(shoppingCartId);
	}
	
	@DeleteMapping("/shopping-carts/{shoppingCartId}")
	public String deleteShoppingCart(@PathVariable Long shoppingCartId) {
		return shoppingCartsService.deleteShoppingCart(shoppingCartId);
	}
}
