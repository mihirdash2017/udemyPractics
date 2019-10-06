package com.example.resrsecurity.basicRestSecurity.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.resrsecurity.basicRestSecurity.model.Customer;

@RestController
public class CustomerRestController {
	
	@GetMapping(value="/cdetails")
	public List<Customer> getCustDetails(){
		
		List<Customer>clist=new ArrayList();
		Customer c1=new Customer("101", "Mihir");
		Customer c2=new Customer("102", "Malay");
		Customer c3=new Customer("103", "Pralay");
		clist.add(c1);
		clist.add(c2);
		clist.add(c3);
		
		return clist;
		
	}

}
