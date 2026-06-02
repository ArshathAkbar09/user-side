package com.project.user.management.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	UserService service;

	public UserController(UserService service) {
		super();
		this.service = service;
	}
	
	
}
