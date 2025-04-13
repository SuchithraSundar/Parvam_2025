package com.geccrud.SpringBootEmployee.dto;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data

public class EmployeeDTO {

		private Long id;
		@NotBlank(message = "Employee name is required")
		private String Name;
		@NotBlank(message ="Employee email is required")
		@Email
		private String email;
		@NotBlank(message = "Employee password is required")
		private String password;
		@NotBlank(message = "Employee phone no is required")
		private String phone;
		@NotBlank(message = "Employee address is required")
		private String address;
		private MultipartFile image;
		
		private MultipartFile document;

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

		public MultipartFile getImage() {
			return image;
		}

		public void setImage(MultipartFile image) {
			this.image = image;
		}

		public MultipartFile getDocument() {
			return document;
		}

		public void setDocument(MultipartFile document) {
			this.document = document;
		}

		@Override
		public String toString() {
			return "EmployeeDTO [id=" + id + ", Name=" + Name + ", email=" + email + ", password=" + password
					+ ", phone=" + phone + ", address=" + address + ", image=" + image + ", document=" + document + "]";
		}
		
		
		
		
	
		
	}