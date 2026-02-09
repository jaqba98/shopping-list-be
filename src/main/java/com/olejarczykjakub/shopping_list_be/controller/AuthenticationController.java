package com.olejarczykjakub.shopping_list_be.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {
	@PostMapping("/login")
	public String login() {
		return "Login!";
	}
	
	@PostMapping("/logout")
	public String logout() {
		return "Logout!";
	}
	
	@PostMapping("/refresh")
	public String refresh() {
		return "Refresh!";
	}
	
	@PostMapping("/validate")
	public String validate() {
		return "Validate!";
	}
}
