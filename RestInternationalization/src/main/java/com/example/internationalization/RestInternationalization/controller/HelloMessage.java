package com.example.internationalization.RestInternationalization.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloMessage {
	
	@Autowired
	private MessageSource messageSource;
	
	@GetMapping(value="/msg")
	public String getMessage(@RequestHeader(name="Accept-Language",required=false) Locale locale){
		return messageSource.getMessage("good.morning.message",null, locale);
	}

}
