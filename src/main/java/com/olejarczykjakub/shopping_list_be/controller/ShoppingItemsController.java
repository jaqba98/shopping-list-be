package com.olejarczykjakub.shopping_list_be.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingItemsController {
	@PostMapping("/shopping-items")
	public String createShoppingItem() {
		return "The shopping item was created!";
	}
	
	@GetMapping("/shopping-items")
	public String readShoppingItems() {
		return "The shopping items were readed!";
	}
	
	@GetMapping("/shopping-items/{shoppingItemId}")
	public String readShoppingItem(@PathVariable Long shoppingItemId) {
		return "The shopping item with id: " + shoppingItemId + " was readed!";
	}
	
	@PutMapping("/shopping-items/{shoppingItemId}")
	public String updateShoppingItem(@PathVariable Long shoppingItemId) {
		return "The shopping item with id: " + shoppingItemId + " was updated!";
	}
	
	@DeleteMapping("/shopping-items/{shoppingItemId}")
	public String deleteShoppingItem(@PathVariable Long shoppingItemId) {
		return "The shopping item with id: " + shoppingItemId + " was deleted!";
	}
}
