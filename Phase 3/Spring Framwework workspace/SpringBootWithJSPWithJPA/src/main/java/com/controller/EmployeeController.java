package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bean.Employee;
import com.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value = "/storeEmployee")
	public String storeEmployee(@RequestParam("name") String name, 
			@RequestParam("salary") float salary, Employee emp) {
			emp.setName(name);
			emp.setSalary(salary);
			//System.out.println(emp.getName()+" "+emp.getSalary());
			String result = employeeService.storeEmployee(emp);
			System.out.println(result);
			return "addEmployee";
	}
}
