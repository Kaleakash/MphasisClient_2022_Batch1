package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.bean.Employee;
import com.resource.DbResource;

public class EmployeeDao {

	public List<Employee> getAllEmployee() {
		SessionFactory sf = DbResource.getSessionFactory();
		Session session = sf.openSession();
		Query qry = session.createQuery("select emp from Employee emp");
		List<Employee> listOfEmp = qry.list();
		return listOfEmp;
	}
}
