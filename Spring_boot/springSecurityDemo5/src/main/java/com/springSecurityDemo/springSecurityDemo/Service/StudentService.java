package com.springSecurityDemo.springSecurityDemo.Service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.springSecurityDemo.springSecurityDemo.PasswordEnc;
import com.springSecurityDemo.springSecurityDemo.Repository.StudentRepository;
import com.springSecurityDemo.springSecurityDemo.dto.StudentDTO;
import com.springSecurityDemo.springSecurityDemo.models.Student;

@Service
public class StudentService {
	private StudentRepository studentRepository;
	private PasswordEncoder passwordEncoder;

	public StudentService(StudentRepository studentRepository, PasswordEncoder passwordEncoder) {
		super();
		this.studentRepository = studentRepository;
		this.passwordEncoder = passwordEncoder;
	}

	public void storeStudent(StudentDTO studentDTO) {
		Student student = new Student();
		
		student.setName(studentDTO.getName());
		student.setEmail(studentDTO.getEmail());
		student.setPassword(passwordEncoder.encode(studentDTO.getPassword()));
		student.setRole("ROLE_USER");
		studentRepository.save(student);
		
	}
}
