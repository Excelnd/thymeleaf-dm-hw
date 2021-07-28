package com.ihs2code.springboot.thymeleafdm.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ihs2code.springboot.thymeleafdm.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// no need to write additional code for CRUD
	
	// add a method to sort by last name
	public List<Employee> findAllByOrderByLastNameAsc(); 
}
