package com.geccrud.SpringBootEmployee.controller;

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

import com.geccrud.SpringBootEmployee.dto.EmployeeDTO;
import com.geccrud.SpringBootEmployee.models.Employee;
import com.geccrud.SpringBootEmployee.repository.EmployeeRepository;
import com.geccrud.SpringBootEmployee.service.EmployeeService;

import jakarta.validation.Valid;

@Controller
public class EmpController {
	
	private final EmployeeService employeeService;
	private final EmployeeRepository employeeRepository;

	// Constructor injection
	public EmpController(EmployeeService employeeService, EmployeeRepository employeeRepository) {
		super();
		this.employeeService = employeeService;
		this.employeeRepository = employeeRepository;
	}

	// Home method to fetch employees
	@GetMapping({"", "/"})
	public String employees(Model model) {
		List<Employee> employees = employeeService.getAllEmployees();
		model.addAttribute("employees", employees);
		return "employees"; 
	}

	@GetMapping("/add-employee")
	public String addEmployee(Model model) {
		model.addAttribute("employeeDTO",new EmployeeDTO());
		return "add_employee"; 
	}

	@PostMapping("/add_employee")
	public String saveEmployee(@Valid @ModelAttribute EmployeeDTO employeeDTO, BindingResult result, Model model, RedirectAttributes attributes) {
		// Duplicate email validation
		Employee employee = employeeRepository.findByEmail(employeeDTO.getEmail());
		if (employee != null) {
			result.addError(new FieldError("employeeDTO", "email", "Email already exists"));
		}
		
		// Image validation
		if (employeeDTO.getImage().isEmpty()) {
			result.addError(new FieldError("employeeDTO", "image", "Image is required"));
		}
		
		// Document validation
		if (employeeDTO.getDocument().isEmpty()) {
			result.addError(new FieldError("employeeDTO", "document", "Document is required"));
		}

		if (result.hasErrors()) {
			return "add_employee"; // Returns to the form with errors
		}

		// Save the employee
		System.out.println(employeeDTO.getName()+"2");
		employeeService.saveEmployee(employeeDTO);
		attributes.addFlashAttribute("success", "Employee added successfully");
		return "redirect:/";
	}

	// Delete employee method
	@GetMapping("/delete-employee")
	public String deleteEmployee(@RequestParam Long id) {
		employeeService.deleteEmployee(id);
		return "redirect:/";
	}

	// Edit employee page
	@GetMapping("/edit-employee/{id}")
	public String editEmployee(@RequestParam Long id, Model model) {
		EmployeeDTO employeeDTO = employeeService.editEmployee(id);
		Employee employee = employeeRepository.findById(id).get(); // It's better to use `orElseThrow` for better error handling
		model.addAttribute("employeeDTO", employeeDTO);
		model.addAttribute("employee", employee);
		return "edit_employee"; // Ensure you have a template named "edit_employee.html"
	}

	@PostMapping("/edit-employee")
	public String updateEmployee(@Valid @ModelAttribute EmployeeDTO employeeDTO, BindingResult result, Model model, @RequestParam Long id) {
		// Duplicate email handling in edit page
		Employee existingEmployee = employeeRepository.findByEmail(employeeDTO.getEmail());
		if (existingEmployee != null && !existingEmployee.getId().equals(id)) {
			result.addError(new FieldError("employeeDTO", "email", "Email already exists"));
		}
		
		// Document handling in edit page
		if (employeeDTO.getDocument() == null || employeeDTO.getDocument().isEmpty()) {
			result.addError(new FieldError("employeeDTO", "document", "Document is required"));
		}
		
		// Image handling in edit page (similar to add)
		if (employeeDTO.getImage().isEmpty()) {
			result.addError(new FieldError("employeeDTO", "image", "Image is required"));
		}

		if (result.hasErrors()) {
			Employee employee = employeeRepository.findById(id).get();
			model.addAttribute("employee", employee);
			return "/edit_employee"; // Returns to the form with errors
		}

		employeeService.updateEmployee(employeeDTO, id);
		return "redirect:/";
	}
}
