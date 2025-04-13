package com.geccrud.SpringBootEmployee.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//import jakarta.persistence.*; // represents include s all thing come under persistence 

@Entity
@Table(name="employees")

public class Employee {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private String Name;
		private String email;
		private String password;
		private String phone;
		private String address;
		private String imagepath;
		
		private String documentpath;

		
		//full args constructor
		public Employee(Long id, String name, String email, String password, String phone, String address,
				String imagepath, String documentpath) {
			super();
			this.id = id;
			Name = name;
			this.email = email;
			this.password = password;
			this.phone = phone;
			this.address = address;
			this.imagepath = imagepath;
			this.documentpath = documentpath;
		}

		//no args constructor
		public Employee() {
			super();
		}

		
		//getter and setter
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
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

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
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

		@Override
		public String toString() {
			return "Employee [id=" + id + ", Name=" + Name + ", email=" + email + ", password=" + password + ", phone="
					+ phone + ", address=" + address + ", imagepath=" + imagepath + ", documentpath=" + documentpath
					+ "]";
		}

	}
