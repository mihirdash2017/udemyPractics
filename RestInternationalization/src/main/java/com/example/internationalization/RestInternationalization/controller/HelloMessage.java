package com.example.internationalization.RestInternationalization.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HelloMessage {
	
	@GetMapping(value="/msg")
	public String getMessage(){
		return "good Morning";
	}

}
