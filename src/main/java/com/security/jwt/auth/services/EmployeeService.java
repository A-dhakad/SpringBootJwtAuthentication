package com.security.jwt.auth.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.security.jwt.auth.entities.Employee;

@Service
public class EmployeeService {
	public List<Employee> empList = new ArrayList<Employee>();
	
	public EmployeeService() {
		empList.add(new Employee(1, "anupam", "a@gmail.com"));
		empList.add(new Employee(2, "nikhil", "b@gmail.com"));
		empList.add(new Employee(3, "jogi", "c@gmail.com"));
	}
	
	public List<Employee> getAllEmployees(){
		return empList;
	}
}
