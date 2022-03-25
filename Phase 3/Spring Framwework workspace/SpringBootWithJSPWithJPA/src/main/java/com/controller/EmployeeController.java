package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
			@RequestParam("salary") float salary, Employee emp,Model mm) {
			emp.setName(name);
			emp.setSalary(salary);
			//System.out.println(emp.getName()+" "+emp.getSalary());
			String result = employeeService.storeEmployee(emp);
			mm.addAttribute("msg", result);      // HttpServletRequest req, req.setAttribute("msg",result);
			System.out.println(result);
			return "addEmployee";
	}
	
	@RequestMapping(value="/displayEmployee")
	public String displayEmployeeDetails(Model mm) {
		List<Employee> listOfEmp = employeeService.getAllEmployee();
		mm.addAttribute("listOfEmployee", listOfEmp);	// req.setAttribute("listOfEmployee",listOfEmp);
		return "display";
	}
}









