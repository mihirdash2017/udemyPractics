package com.example.restversion.RestVersion.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restversion.RestVersion.model.Name;
import com.example.restversion.RestVersion.model.PersonV1;
import com.example.restversion.RestVersion.model.PersonV2;

@RestController
public class PersonController {

	/*
	 * This is one way to do the versioning
	 * this is an example if URI versioning
	 * The best way to implenet the versioning
	 * 
		@GetMapping(value="v1/person")
		public PersonV1 getPersonV1Details(){
			return new PersonV1("Mihir Dash");
		}
		
		@GetMapping(value="v2/person")
		public PersonV2 getPersonV2Details(){
			Name name=new Name("Mihir", "Dash");
			return new PersonV2(name);
		}
		*/
	/*
	 * This is using param value
	 * this is an example if param versioning
	 * http://localhost:7848/person/param?version1
	 * http://localhost:7848/person/param?version2
	 * 
	@GetMapping(value="/person/param",params="version1")
	public PersonV1 getPersonV1Details(){
		return new PersonV1("Mihir Dash");
	}
	
	@GetMapping(value="/person/param",params="version2")
	public PersonV2 getPersonV2Details(){
		Name name=new Name("Mihir", "Dash");
		return new PersonV2(name);
	}
	*/
	
	/*
	 * This is used by headers
	 * this is an example of header versioning
	 * url is http://localhost:7848/person/headers
	 * need to pass value in header from client and i h ave added a out.jpg file 
	 * 
	@GetMapping(value="/person/headers",headers="X-API-VERSION=1")
	public PersonV1 getPersonV1Details(){
		return new PersonV1("Mihir Dash");
	}
	
	@GetMapping(value="/person/headers",headers="X-API-VERSION=2")
	public PersonV2 getPersonV2Details(){
		Name name=new Name("Mihir", "Dash");
		return new PersonV2(name);
	}
	*/
		
	/*
	 * This is used by produces
	 * we can say it content negotiation versioning or mediytype version
	 * please check out1.jpg
	 * 
	@GetMapping(value="/person/produces",produces="application/vnd.company.app-v1+json")
	public PersonV1 getPersonV1Details(){
		return new PersonV1("Mihir Dash");
	}
	
	@GetMapping(value="/person/produces",produces="application/vnd.company.app-v2+json")
	public PersonV2 getPersonV2Details(){
		Name name=new Name("Mihir", "Dash");
		return new PersonV2(name);
	}
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
