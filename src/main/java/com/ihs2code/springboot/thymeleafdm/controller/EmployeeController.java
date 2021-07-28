package com.ihs2code.springboot.thymeleafdm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ihs2code.springboot.thymeleafdm.entity.Employee;
import com.ihs2code.springboot.thymeleafdm.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
		
	private EmployeeService employeeService;

	
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	// add mapping for "/list"
	
	@GetMapping("/list")
	public String listEmployees(Model theModel) {
		
		List<Employee> theEmployees = employeeService.findAll();
		
		// add to the spring model
		theModel.addAttribute("employees", theEmployees);
		
		return "list-employees";
	}
}
