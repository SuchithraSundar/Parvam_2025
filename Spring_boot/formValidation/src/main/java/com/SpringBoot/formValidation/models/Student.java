package com.SpringBoot.formValidation.models;

import jakarta.persistence.Column;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "Student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="std_id")
	private long id;
	private String name;
	private int age;
	@Column(unique = true)
	private String email;
	private String password;
	private String imagepath;
	
	private String documentpath;
	
	//full args constructor
	public Student(long id, String name, int age, String email, String password, String imagepath,
			String documentpath) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.password = password;
		this.imagepath = imagepath;
		this.documentpath = documentpath;
	}
	
	public Student() {
		super();
	}

	//getter and setter
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getImagepath() {
		return imagepath;
	}

	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}
	
	public String getDocumentpath() {
		return documentpath;
	}

	public void setDocumentpath(String documentpath) {
		this.documentpath = documentpath;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static void main(String[] args) {
		
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", password=" + password
				+ ", imagepath=" + imagepath + ", documentpath=" + documentpath + "]";
	}
	
}
