package com.olejarczykjakub.shopping_list_be.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {
	@PostMapping("/accounts")
	public String createAccount() {
		return "The account was created!";
	}
	
	@GetMapping("/accounts")
	public String readAccounts() {
		return "The accounts were readed!";
	}
	
	@GetMapping("/accounts/{accountId}")
	public String readAccount(@PathVariable Long accountId) {
		return "The account with id: " + accountId + " was readed!";
	}
	
	@PutMapping("/accounts/{accountId}")
	public String updateAccount(@PathVariable Long accountId) {
		return "The account with id: " + accountId + " was updated!";
	}
	
	@DeleteMapping("/accounts/{accountId}")
	public String deleteAccount(@PathVariable Long accountId) {
		return "The account with id: " + accountId + " was deleted!";
	}
}
