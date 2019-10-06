package com.example.restversion.RestVersion.model;

import java.io.Serializable;

public class PersonV1 implements Serializable {
	private String name;

	public PersonV1(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PersonV1 [name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
	
	

}
