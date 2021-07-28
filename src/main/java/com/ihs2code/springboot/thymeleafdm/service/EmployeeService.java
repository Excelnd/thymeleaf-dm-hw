package com.ihs2code.springboot.thymeleafdm.service;

import java.util.List;

import com.ihs2code.springboot.thymeleafdm.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
}
