package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Employee;
import com.service.EmployeeService;

// http://localhost:8080/employees/
@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
//	@RequestMapping(value = "getAllEmployee",method = RequestMethod.GET)
//	public List<Employee> getAllEmployees() {
//		return employeeService.getAllEmployee();
//	}
	
	@GetMapping(value = "getAllEmployee")
	public List<Employee> getAllEmployees() {
	return employeeService.getAllEmployee();
	}
	
}
