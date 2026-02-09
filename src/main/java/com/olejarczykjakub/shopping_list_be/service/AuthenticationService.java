package com.olejarczykjakub.shopping_list_be.service;

import org.springframework.stereotype.Service;

import com.olejarczykjakub.shopping_list_be.dto.request.LoginRequestDto;

@Service
public class AuthenticationService {
	public String login(LoginRequestDto loginRequestDto) {
		String email = loginRequestDto.email();
		String password = loginRequestDto.password();
		return "Email: " + email + ", password: " + password;
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
