package com.olejarczykjakub.shopping_list_be.service;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	public String login() {
		return "Login!";
	}
	
	public String logout() {
		return "Logout!";
	}
	
	public String refresh() {
		return "Refresh!";
	}
	
	public String validate() {
		return "Validate!";
	}
}
