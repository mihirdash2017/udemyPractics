package com.example.UserRestService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.UserRestService.dao.UserDao;
import com.example.UserRestService.model.User;

@RestController
public class UserRestController {
	
	@Autowired
	private UserDao daoService;
	
	@GetMapping(value="/user")
	public List<User>retriveAllUser(){
		return daoService.findAll();
		
	}

}
