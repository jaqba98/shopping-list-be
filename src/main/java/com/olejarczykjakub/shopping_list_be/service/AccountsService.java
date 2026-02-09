package com.olejarczykjakub.shopping_list_be.service;

import org.springframework.stereotype.Service;

@Service
public class AccountsService {
	public String createAccount() {
		return "The account was created!";
	}
	
	public String readAccounts() {
		return "The accounts were readed!";
	}
	
	public String readAccount(Long accountId) {
		return "The account with id: " + accountId + " was readed!";
	}
	
	public String updateAccount(Long accountId) {
		return "The account with id: " + accountId + " was updated!";
	}
	
	public String deleteAccount(Long accountId) {
		return "The account with id: " + accountId + " was deleted!";
	}
}
