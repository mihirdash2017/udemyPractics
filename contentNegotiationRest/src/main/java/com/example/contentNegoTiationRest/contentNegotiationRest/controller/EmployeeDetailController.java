package com.example.contentNegoTiationRest.contentNegotiationRest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.contentNegoTiationRest.contentNegotiationRest.model.EmployeeModel;

@RestController
public class EmployeeDetailController {
	
	@GetMapping(value="/emp")
	public List<EmployeeModel> getEmpDetails(){
		EmployeeModel emp=new EmployeeModel("101","Mihir", 1293.0);
		EmployeeModel emp1=new EmployeeModel("102","Malay", 1240.0);
		EmployeeModel emp2=new EmployeeModel("103","Pralay", 1241.0);
		
		List<EmployeeModel> empList=new ArrayList();
		empList.add(emp);
		empList.add(emp1);
		empList.add(emp2);
		return empList;
	}
}
