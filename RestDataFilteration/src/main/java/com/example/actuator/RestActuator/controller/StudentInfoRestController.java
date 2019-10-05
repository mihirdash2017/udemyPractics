package com.example.actuator.RestActuator.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.actuator.RestActuator.model.Student;

@RestController
public class StudentInfoRestController {
	
	@GetMapping(value="/sinfo")
	public List<Student>getAllStudentInfo(){
		Student s1=new Student("101", "Mihir", "B");
		Student s2=new Student("102", "Malay", "B+");
		Student s3=new Student("103", "Pralay", "A");
		List<Student>studentList=new ArrayList<Student>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		
		return studentList;
	}

}
