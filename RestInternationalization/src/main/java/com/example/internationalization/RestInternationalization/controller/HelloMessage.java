package com.example.internationalization.RestInternationalization.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloMessage {
	
	@GetMapping(value="/msg")
	public String getMessage(){
		return "good Morning";
	}

}
