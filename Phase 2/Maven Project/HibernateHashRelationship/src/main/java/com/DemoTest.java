package com;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemoTest {

	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.getTransaction();
		
		// Trainer record insert 
//		Trainer t = new Trainer();
//		t.setTid(2);
//		t.setTname("Raju");
//		t.setTech("Python");
//		tran.begin();
//			session.save(t);
//		tran.commit();
//		System.out.println("Trainer record saved...");
		
		// Student record insert 
//		Student s = new Student();
//		s.setSid(102);
//		s.setSname("Leeta");
//		s.setAge(24);
//		s.setTsid(2);
//		tran.begin();
//				session.save(s);
//		tran.commit();
//		System.out.println("Student Record saved....");
		
		Trainer t = new Trainer();
		t.setTid(4);
		t.setTname("Raju");
		t.setTech("React JS");

		List<Student> listOfStd = new ArrayList<>();
		
		Student s1 =new Student(103, "Meeta", 24, 4);
		Student s2 =new Student(104, "Veeta", 25, 4);
		
		listOfStd.add(s1);
		listOfStd.add(s2);
		
		t.setListOfStudent(listOfStd);
		
		tran.begin();
				session.save(t);			// only save trainer object. 
			//session.save(s1);
			//session.save(s2);
		tran.commit();
		System.out.println("Trainer record saved...");
		
	}

}
