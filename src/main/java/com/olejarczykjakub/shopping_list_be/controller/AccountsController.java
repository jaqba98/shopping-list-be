package com.olejarczykjakub.shopping_list_be.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olejarczykjakub.shopping_list_be.service.AccountsService;

@RestController
public class AccountsController {
	private final AccountsService accountsService;
	
	public AccountsController(AccountsService accountsService) {
		this.accountsService = accountsService;
	}
	
	@PostMapping("/accounts")
	public String createAccount() {
		return accountsService.createAccount();
	}
	
	@GetMapping("/accounts")
	public String readAccounts() {
		return accountsService.readAccounts();
	}
	
	@GetMapping("/accounts/{accountId}")
	public String readAccount(@PathVariable Long accountId) {
		return accountsService.readAccount(accountId);
	}
	
	@PutMapping("/accounts/{accountId}")
	public String updateAccount(@PathVariable Long accountId) {
		return accountsService.updateAccount(accountId);
	}
	
	@DeleteMapping("/accounts/{accountId}")
	public String deleteAccount(@PathVariable Long accountId) {
		return accountsService.deleteAccount(accountId);
	}
}
