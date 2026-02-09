package com.olejarczykjakub.shopping_list_be.service;

import org.springframework.stereotype.Service;

@Service
public class ShoppingItemsService {
	public String createShoppingItem() {
		return "The shopping item was created!";
	}
	
	public String readShoppingItems() {
		return "The shopping items were readed!";
	}
	
	public String readShoppingItem(Long shoppingItemId) {
		return "The shopping item with id: " + shoppingItemId + " was readed!";
	}
	
	public String updateShoppingItem(Long shoppingItemId) {
		return "The shopping item with id: " + shoppingItemId + " was updated!";
	}
	
	public String deleteShoppingItem(Long shoppingItemId) {
		return "The shopping item with id: " + shoppingItemId + " was deleted!";
	}
}
