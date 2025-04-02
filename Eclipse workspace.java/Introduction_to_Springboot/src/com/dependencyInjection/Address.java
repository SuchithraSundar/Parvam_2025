package com.dependencyInjection;

public class Address {
	private String city;
	private String state;
	
	//constructor for constructor injection
	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}
	
	
	//no args construcor for setter injection:
	public Address() {
		super();
	}


	//getter and setter for constructor injection
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
}
