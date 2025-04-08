package com.SpringBoot.formValidation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot.formValidation.models.Student;

@Repository
public interface StudentRepository  extends JpaRepository<Student,Long> {
	/*
	 * spring data jpa ->jpa -> hibernate -> jdbc(java database connection)
	 * ->database
	 * 
	 * 1. to get all details -> findAll();
	 * 2. to get single data -> findById(id);
	 * 3. to delete data ->deleteById(id); / delete(object);
	 * 4. to create or update -> save(object);
	 * 
	 * findBy ->it gives an object
	 * existBy -> boolean
	 * */
	
	public Student findByEmail(String email);
}
