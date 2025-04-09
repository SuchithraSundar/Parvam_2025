package com.dependencyInjection;

public class Student {
	private int id;
	private String name;
	private Address address;
	
	//full args constructor for constructor injection:
	public Student(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	//no args construcor for setter injection:

	public Student() {
		super();
	}

	//getter and setter for constructor injection
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
