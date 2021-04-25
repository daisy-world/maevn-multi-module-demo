package com.easy2excel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.easy2excel.entity.User;
import com.easy2excel.service.UserService;

@RestController
public class UserController {
	
	@Autowired UserService userService;
	
	@PostMapping("/saveUser")
	
	public User saveUser(@RequestBody User user) {
		
		User response = userService.saveUser(user);
		return response;
		
		
		
	}

}
