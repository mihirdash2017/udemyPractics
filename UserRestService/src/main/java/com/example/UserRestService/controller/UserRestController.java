package com.example.UserRestService.controller;

import java.net.URI;
import java.util.List;

import javax.ws.rs.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
	@GetMapping(value="/user/{id}")
	public User retriveUser(@PathVariable int id){
		
		return daoService.findUser(id);
	}
	
	@PostMapping(value="/createUser")
	public ResponseEntity<Object> createUser(@RequestBody User user){
		User savedUser=daoService.saveUser(user);
		//how to setup created status
		URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
		return ResponseEntity.created(location).build();
		
	}
	
	
}
