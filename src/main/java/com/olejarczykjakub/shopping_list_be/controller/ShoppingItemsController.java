package com.olejarczykjakub.shopping_list_be.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olejarczykjakub.shopping_list_be.service.ShoppingItemsService;

@RestController
public class ShoppingItemsController {
	private final ShoppingItemsService shoppingItemsService;
	
	@Autowired
	public ShoppingItemsController(ShoppingItemsService shoppingItemsService) {
		this.shoppingItemsService = shoppingItemsService;
	}
	
	@PostMapping("/shopping-items")
	public String createShoppingItem() {
		return shoppingItemsService.createShoppingItem();
	}
	
	@GetMapping("/shopping-items")
	public String readShoppingItems() {
		return shoppingItemsService.readShoppingItems();
	}
	
	@GetMapping("/shopping-items/{shoppingItemId}")
	public String readShoppingItem(@PathVariable Long shoppingItemId) {
		return shoppingItemsService.deleteShoppingItem(shoppingItemId);
	}
	
	@PutMapping("/shopping-items/{shoppingItemId}")
	public String updateShoppingItem(@PathVariable Long shoppingItemId) {
		return shoppingItemsService.updateShoppingItem(shoppingItemId);
	}
	
	@DeleteMapping("/shopping-items/{shoppingItemId}")
	public String deleteShoppingItem(@PathVariable Long shoppingItemId) {
		return shoppingItemsService.deleteShoppingItem(shoppingItemId);
	}
}
