package com.example.actuator.RestActuator.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.actuator.RestActuator.model.Student;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class StudentInfoRestController {
	
	@GetMapping(value="/sinfo")
	public MappingJacksonValue getAllStudentInfo(){
		Student s1=new Student("101", "Mihir", "B");
		Student s2=new Student("102", "Malay", "B+");
		Student s3=new Student("103", "Pralay", "A");
		List<Student>studentList=new ArrayList<Student>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		
		MappingJacksonValue mapping=new MappingJacksonValue(studentList);
		
		SimpleBeanPropertyFilter filter=SimpleBeanPropertyFilter.filterOutAllExcept("name","grade");
		FilterProvider filters=new SimpleFilterProvider().addFilter("myStudent", filter);
		mapping.setFilters(filters);
		
		return mapping;
	}

}
