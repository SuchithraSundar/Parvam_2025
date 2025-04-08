package com.SpringBoot.formValidation.controller;

import java.util.List;




import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.SpringBoot.formValidation.dto.StudentDTO;
import com.SpringBoot.formValidation.models.Student;
import com.SpringBoot.formValidation.repository.StudentRepository;
import com.SpringBoot.formValidation.service.StudentService;

import jakarta.validation.Valid;

@Controller
public class StudentController {
	
	private final StudentService studentService;
	private final StudentRepository studentRepository;
	
	public StudentController(StudentService studentService, StudentRepository studentRepository) {
		super();
		this.studentService = studentService;
		this.studentRepository = studentRepository;
	}

	//home method to fetch students
	@GetMapping({"", "/"})
	public String home(Model model) {
		List<Student> students = studentService.getAllStudents();
		model.addAttribute("students", students); 
		return "home";// Pass student list to home.html
	}
	
	 
	@GetMapping("/add-student")
	public String addStudent(Model model) {
		model.addAttribute("studentDTO", new StudentDTO());
		return "add_student";
	}

	@PostMapping("/add-student")
	public String addStudent(@Valid @ModelAttribute StudentDTO studentDTO, BindingResult result, Model model, RedirectAttributes attributes) {
		// duplicate email validation
		Student student = studentRepository.findByEmail(studentDTO.getEmail());
		if(student!=null) {
			result.addError(new FieldError("StudentDTO","email","Email is already exists"));
		}
		// image validation
		if(studentDTO.getImage().isEmpty()) {
			result.addError(new FieldError("StudentDTO","image","Image is required"));
		}
		//document validation
		if(studentDTO.getDocument().isEmpty()) {
			result.addError(new FieldError("StudentDTO","document","Document is required"));
		}
		
		if (result.hasErrors()) {
			return "add_student";
		}
		System.out.println(studentDTO.getName()+"2");
		studentService.saveStudent(studentDTO);
		attributes.addFlashAttribute("success","Student added successfully");
		return "redirect:/"; // Redirect to home page after saving student
	}
	
	//to delete student data
	@GetMapping("/std-delete")
	public String deleteStudent(@RequestParam Long id) {
		studentService.deleteStudent(id);
		return "redirect:/";
	}
	
	@GetMapping("/std-edit")
	public String editStudent(@RequestParam Long id,Model model) {
		StudentDTO studentDTO = studentService.editStudent(id);
		Student student = studentRepository.findById(id).get();
		model.addAttribute("studentDTO", studentDTO);//it is for getting data from frontend
		model.addAttribute("student",student);//it is for id and imagepath,we cant get imagepath from DTO because it has image as string
		return "edit_student";
	}
	
	@PostMapping("/edit-student")
	public String updateStudent(@Valid @ModelAttribute StudentDTO studentDTO,BindingResult result,Model model,@RequestParam Long id)  {
	    //duplicate email handling in edit page
		Student student1 = studentRepository.findByEmail(studentDTO.getEmail());
		if(student1!=null && student1.getId()!= id) {
			result.addError(new FieldError("StudentDTO","email","Email is already exists"));
		}
		//document handling in edit page
		if (studentDTO.getDocument() == null || studentDTO.getDocument().isEmpty()) {
	        result.addError(new FieldError("StudentDTO", "document", "Document is required"));
	     }
		//image handling in edit page
		if(result.hasErrors()) {
			Student student = studentRepository.findById(id).get();
			model.addAttribute("student",student);
			return "/edit_student";
		}
		studentService.updateStudent(studentDTO,id);
		return "redirect:/";
	}
	

}
