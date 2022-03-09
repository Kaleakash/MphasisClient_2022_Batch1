package com.service;

import java.util.List;

import com.bean.Employee;
import com.dao.EmployeeDao;

public class EmployeeService {

	
	public List<Employee> getAllEmployee() {
		EmployeeDao ed = new EmployeeDao();
		return ed.getAllEmployee();
	}
}
