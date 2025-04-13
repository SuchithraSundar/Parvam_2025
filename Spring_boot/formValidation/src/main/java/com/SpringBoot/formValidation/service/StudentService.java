package com.SpringBoot.formValidation.service;

import java.io.InputStream;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.SpringBoot.formValidation.FormValidationApplication;
import com.SpringBoot.formValidation.dto.StudentDTO;
import com.SpringBoot.formValidation.models.Student;
import com.SpringBoot.formValidation.repository.StudentRepository;

@Service
public class StudentService {

	   private final FormValidationApplication formValidationApplication;

	    private final StudentRepository studentRepository;

	    // Constructor Injection
	    public StudentService(StudentRepository studentRepository, FormValidationApplication formValidationApplication) {
	        super();
	        this.studentRepository = studentRepository;
	        this.formValidationApplication = formValidationApplication;
	    }

	// Fetch all students from the database and map them to DTOs
	public List<Student> getAllStudents() {
		List<Student> students = studentRepository.findAll();
		return students;
	}

	// Save a student to the database
	public void saveStudent(StudentDTO studentDTO) {
		//to get image and is original name at time
		MultipartFile image = studentDTO.getImage();
		MultipartFile document = studentDTO.getDocument();
		Date createdAt = new Date();
		
		String storeImageName = createdAt.getTime()+"_"+image.getOriginalFilename();
		String storeDocName = createdAt.getTime()+"_"+document.getOriginalFilename();
		
		//to store image in public/images directory
		try {
			String uploadDir = "public/images/";//dir to which we need to save images
			Path uploadPath =Paths.get(uploadDir);//convert the above string into actual path
			if(!Files.exists(uploadPath)) {//checks whether dir exists or not , if not it will create that dir
				Files.createDirectories(uploadPath);
			}
			// the above code only creates the dir but to get uploaded image to be saved in that dir and the backend db we use following code
			try {
				InputStream inputStream = image.getInputStream();
				Files.copy(inputStream , Paths.get(uploadDir+storeImageName),StandardCopyOption.REPLACE_EXISTING);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//to store document in public/document directory
		
		try {
			String docDir = "public/documents/";
			Path docPath = Paths.get(docDir);
			if(!Files.exists(docPath)) {
				Files.createDirectories(docPath);
			}
			try {
				InputStream docStream = document.getInputStream();
				Files.copy(docStream, Paths.get(docDir+storeDocName),StandardCopyOption.REPLACE_EXISTING);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		Student student = new Student();
		student.setName(studentDTO.getName());
		student.setEmail(studentDTO.getEmail());
		student.setAge(studentDTO.getAge());
		student.setPassword(studentDTO.getPassword());
		student.setImagepath(storeImageName);
		student.setDocumentpath(storeDocName);
		studentRepository.save(student);
	}

	//Delete the student from database
	public void deleteStudent(Long id) {
		//whenever we create the object Student it will call optional object so to fetch all details from optional class we use get() method
		Student student = studentRepository.findById(id).get();
		
		//for deleting any student first we need to  delete that student image path first
		String uploadDir ="public/images/";
		Path imagePath = Paths.get(uploadDir+student.getImagepath());
		try {
			Files.delete(imagePath);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//for deleting any student first we need to  delete that student document path first
		String docDir = "public/documents/";
		Path docPath = Paths.get(docDir+student.getDocumentpath());
		try {
			Files.delete(docPath);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		studentRepository.delete(student);
	}

	//Edit the student 
	public StudentDTO editStudent(Long id) {
		Student student = studentRepository.findById(id).get();
		StudentDTO studentDTO = new StudentDTO();
		studentDTO.setName(student.getName());
		studentDTO.setAge(student.getAge());
		studentDTO.setEmail(student.getEmail());
		studentDTO.setPassword(student.getPassword());
		return studentDTO;
		
	}
	
	//Update the student
	public void updateStudent(StudentDTO studentDTO, Long id) {
		//before update the image ,we need to check that is old image selected or not and then need to delete it before upd
		Student student = studentRepository.findById(id).get();
		
		//image updating
		if(!studentDTO.getImage().isEmpty()) {//deleting the old image
			Path oldImagePath =Paths.get("public/images/"+student.getImagepath());
			try {
				Files.delete(oldImagePath);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			//Getting new images after deleting old image 
			MultipartFile image = studentDTO.getImage();
			Date createdAt = new Date(0);
			String storeImageName = createdAt.getTime()+"_"+image.getOriginalFilename();
			String uploadDir ="public/images/";
			// the above code only creates the dir but to get uploaded image to be saved in that dir and the backend db we use following code
			try {
				InputStream inputStream = image.getInputStream();
				Files.copy(inputStream , Paths.get(uploadDir+storeImageName),StandardCopyOption.REPLACE_EXISTING);
				student.setImagepath(storeImageName);	
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		if(!studentDTO.getDocument().isEmpty()) {
			Path oldDocPath =Paths.get("public/documents/"+"_"+student.getDocumentpath());
			try {
				Files.delete(oldDocPath);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			//Getting new document after deleting old image 
			MultipartFile document = studentDTO.getDocument();
			Date createdAt1 = new Date(0);
			String storeDocName = createdAt1.getTime()+"_"+document.getOriginalFilename();
			String docDir = "public/documents/";
			// the above code only creates the dir but to get uploaded image to be saved in that dir and the backend db we use following code
			try {
				InputStream docStream = document.getInputStream();
				Files.copy(docStream, Paths.get(docDir+storeDocName),StandardCopyOption.REPLACE_EXISTING);
				student.setDocumentpath(storeDocName);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
 			
		}
		student.setName(studentDTO.getName());
		student.setAge(studentDTO.getAge());
		student.setEmail(studentDTO.getEmail());
		student.setPassword(studentDTO.getPassword());
		studentRepository.save(student);
	}
	
	


}
