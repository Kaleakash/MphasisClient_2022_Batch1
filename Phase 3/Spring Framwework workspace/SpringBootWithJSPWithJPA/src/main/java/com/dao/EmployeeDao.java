package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Employee;

@Repository
public class EmployeeDao {

	@Autowired							// @Autowired 	
	EntityManagerFactory emf;			//@SessionFactory sf
	
	public int storeEmployee(Employee emp) {
		try {
		EntityManager manager = emf.createEntityManager();		// Session session =sf.openSession();
		EntityTransaction tran = manager.getTransaction();		// Transaction tran = session.getTransaction();
		tran.begin();
				manager.persist(emp);                           // session.save(emp);
		tran.commit();
		return 1;
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}
}
