package com.samples.S09springmvcorm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.samples.S09springmvcorm.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
}