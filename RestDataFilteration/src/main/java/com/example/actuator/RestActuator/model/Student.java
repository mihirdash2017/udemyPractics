package com.example.actuator.RestActuator.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//static filteration using this @JsonIgnoreProperties(value={"sid","name"})
public class Student {
	private String sid;
	private String name;
	
	@JsonIgnore
	//this is example of static filteration
	private String grade;
	public Student(String sid, String name, String grade) {
		super();
		this.sid = sid;
		this.name = name;
		this.grade = grade;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [sid=");
		builder.append(sid);
		builder.append(", name=");
		builder.append(name);
		builder.append(", grade=");
		builder.append(grade);
		builder.append("]");
		return builder.toString();
	}
	

}
