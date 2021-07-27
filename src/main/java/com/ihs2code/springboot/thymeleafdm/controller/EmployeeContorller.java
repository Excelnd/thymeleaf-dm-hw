package com.ihs2code.springboot.thymeleafdm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ihs2code.springboot.thymeleafdm.model.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeContorller {

	
	// load employee data
	
	private List<Employee> theEmployees;
	
	private void loadData() {
		
		// create employees
		Employee emp1 = new Employee(1, "James", "Andrews", "james@ihs2code.com");
		Employee emp2 = new Employee(2, "Jemma", "Baumgarten", "jemma@ihs2code.com");
		Employee emp3 = new Employee(3, "Avani", "Andrews", "avani@ihs2code.com");
		
		
		// create the list
		theEmployees = new ArrayList<>();
		
		// add to the list
		theEmployees.add(emp1);
		theEmployees.add(emp2);
		theEmployees.add(emp3);
		
	}
	
	// add mapping for "/list"
	
	@GetMapping("/list")
	public String listEmployees(Model theModel) {
		
		// add to the spring model
		theModel.addAttribute("employees", theEmployees);
		
		return "list-employees";
	}
}
