package com.example.auth.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.auth.service.AuthService;

@RestController
@RequestMapping("/auth")
public class AuthController {
	private final AuthService authService;

	public AuthController(AuthService authService) {
		//super();
		this.authService = authService;
	}
	
	@PostMapping("/regster")
	public String register(@RequestParam String username, @RequestParam String password, @RequestParam String email) {
		return authService.registerUser(username, email, password);
	}
	
	@PostMapping("/login")
	public String login(@RequestParam String username, @RequestParam String password) {
		return authService.loginUser(username, password);
	}
	
	
	
}
