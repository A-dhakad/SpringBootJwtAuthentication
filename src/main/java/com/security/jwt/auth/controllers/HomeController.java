package com.security.jwt.auth.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.jwt.auth.entities.Employee;
import com.security.jwt.auth.services.EmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/welcome")
public class HomeController {
	
	@Autowired
	private EmployeeService employeeService;
	@GetMapping("/employees")
	
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}
	

}
