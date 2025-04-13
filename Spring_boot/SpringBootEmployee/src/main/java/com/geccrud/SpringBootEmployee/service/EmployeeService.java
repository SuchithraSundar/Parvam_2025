package com.geccrud.SpringBootEmployee.service;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Date;
import java.util.List;


import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.geccrud.SpringBootEmployee.SpringBootEmployeeApplication;
import com.geccrud.SpringBootEmployee.dto.EmployeeDTO;
import com.geccrud.SpringBootEmployee.models.Employee;
import com.geccrud.SpringBootEmployee.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	private final SpringBootEmployeeApplication springBootEmplyeeApplication;
	private final EmployeeRepository employeeRepository;
	
	//create constructor 
   public EmployeeService(SpringBootEmployeeApplication springBootEmplyeeApplication,
			EmployeeRepository employeeRepository) {
		super();
		this.springBootEmplyeeApplication = springBootEmplyeeApplication;
		this.employeeRepository = employeeRepository;
	}



	// to get list of employee
	public List<Employee> getAllEmployees(){
		List<Employee> employees= employeeRepository.findAll();
	    return employees;
	
    }
	
	// Save a employee to the database
	public void saveEmployee(EmployeeDTO employeeDTO) {
		//to get image and is original name at time
		MultipartFile image  = employeeDTO.getImage();
		MultipartFile document =employeeDTO.getDocument();
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
		
		Employee employee= new Employee();
		employee.setName(employeeDTO.getName());
		employee.setEmail(employeeDTO.getEmail());
		employee.setPassword(employeeDTO.getPassword());
		employee.setPhone(employeeDTO.getPhone());
		employee.setAddress(employeeDTO.getAddress());
		employee.setImagepath(storeImageName);
		employee.setDocumentpath(storeDocName);
		employeeRepository.save(employee);
		
	}
	
	//Delete the employee from database
	public void deleteEmployee(Long id) {
		Employee employee =employeeRepository.findById(id).get();
		
		//for deleting any student first we need to  delete that student image path first
		String uploadDir ="public/images/";
		Path imagePath = Paths.get(uploadDir+employee.getImagepath());
		try {
			Files.delete(imagePath);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//for deleting any student first we need to  delete that student document path first
		String docDir = "public/documents/";
		Path docPath = Paths.get(docDir+employee.getDocumentpath());
		try {
			Files.delete(docPath);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		employeeRepository.delete(employee);
	}

	//Edit the student 
	public EmployeeDTO editEmployee(Long id) {
		Employee employee = employeeRepository.findById(id).get();
		EmployeeDTO employeeDTO =new EmployeeDTO();
		employeeDTO.setName(employee.getName());
		employeeDTO.setEmail(employee.getEmail());
		employeeDTO.setPassword(employee.getPassword());
		employeeDTO.setPhone(employee.getPhone());
		employeeDTO.setAddress(employee.getAddress());
		employeeDTO.setId(employee.getId());
		return employeeDTO;
	}
	
	
	//Update the employee
	public void updateEmployee(EmployeeDTO employeeDTO, Long id) {
		//before update the image ,we need to check that is old image selected or not and then need to delete it before upd
		Employee employee = employeeRepository.findById(id).get();
		
		//image updating
		if(!employeeDTO.getImage().isEmpty()) {//deleting the old image
			Path oldImagePath =Paths.get("public/images/"+employee.getImagepath());
			try {
				Files.delete(oldImagePath);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			//Getting new images after deleting old image 
			MultipartFile image = employeeDTO.getImage();
			Date createdAt = new Date(0);
			String storeImageName = createdAt.getTime()+"_"+image.getOriginalFilename();
			String uploadDir ="public/images/";
			// the above code only creates the dir but to get uploaded image to be saved in that dir and the backend db we use following code
			try {
				InputStream inputStream = image.getInputStream();
				Files.copy(inputStream , Paths.get(uploadDir+storeImageName),StandardCopyOption.REPLACE_EXISTING);
				employee.setImagepath(storeImageName);	
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			//document updating
			if(!employeeDTO.getDocument().isEmpty()) {
				Path oldDocPath =Paths.get("public/documents/"+"_"+employee.getDocumentpath());
				try {
					Files.delete(oldDocPath);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				//Getting new document after deleting old image 
				MultipartFile document = employeeDTO.getDocument();
				Date createdAt1 = new Date(0);
				String storeDocName = createdAt1.getTime()+"_"+document.getOriginalFilename();
				String docDir = "public/documents/";
				// the above code only creates the dir but to get uploaded image to be saved in that dir and the backend db we use following code
				try {
					InputStream docStream = document.getInputStream();
					Files.copy(docStream, Paths.get(docDir+storeDocName),StandardCopyOption.REPLACE_EXISTING);
					employee.setDocumentpath(storeDocName);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
		employee.setId(employeeDTO.getId());
		employee.setName(employeeDTO.getName());
		employee.setEmail(employeeDTO.getEmail());
		employee.setPassword(employeeDTO.getPassword());
		employee.setPhone(employeeDTO.getPhone());
		employee.setAddress(employeeDTO.getAddress());
		employeeRepository.save(employee);
	}



	}