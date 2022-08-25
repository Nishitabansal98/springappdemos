package com.samples.S09springmvcorm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.samples.S09springmvcorm.dao.UserDao;
import com.samples.S09springmvcorm.service.UserService;

@Component
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userdao;
	
}