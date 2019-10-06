package com.example.resrsecurity.basicRestSecurity.model;

public class Customer {
	
	private String cid;
	private String name;
	public Customer(String cid, String name) {
		super();
		this.cid = cid;
		this.name = name;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
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
		builder.append("Customer [cid=");
		builder.append(cid);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
	
	

}
