package com.olejarczykjakub.shopping_list_be.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olejarczykjakub.shopping_list_be.service.AuthenticationService;

@RestController
public class AuthenticationController {
	private final AuthenticationService authenticationService;
	
	@Autowired
	public AuthenticationController(AuthenticationService authenticationService) {
		this.authenticationService = authenticationService;
	}
	
	@PostMapping("/login")
	public String login() {
		return authenticationService.login();
	}
	
	@PostMapping("/logout")
	public String logout() {
		return authenticationService.logout();
	}
	
	@PostMapping("/refresh")
	public String refresh() {
		return authenticationService.refresh();
	}
	
	@PostMapping("/validate")
	public String validate() {
		return authenticationService.validate();
	}
}
