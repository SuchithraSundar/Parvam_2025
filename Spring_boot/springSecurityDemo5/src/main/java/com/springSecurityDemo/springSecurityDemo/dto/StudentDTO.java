package com.springSecurityDemo.springSecurityDemo.dto;

public class StudentDTO {
	
	private String name;
	private String email;
	private String role;
	private String password;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "StudentDTO [name=" + name + ", email=" + email + ", role=" + role + ", password=" + password + "]";
	}
	
	

}
