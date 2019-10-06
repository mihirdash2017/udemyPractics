package com.example.restversion.RestVersion.model;

import java.io.Serializable;

public class PersonV2 implements Serializable{
	private Name name;

	public PersonV2(Name name) {
		super();
		this.name = name;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PersonV2 [name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
	

}
