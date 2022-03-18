package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DemoTest {

	public static void main(String[] args) {
		//Employee emp = new Employee();
		//emp.display();
		//Resource res = new ClassPathResource("beans.xml"); // file load reference of this class 
														// Resource interface . 
		//BeanFactory bean = new XmlBeanFactory(res);	// BeanFactory is a interface 
													// that interface implementation class 
													// is XmlBeanFactory
		BeanFactory bean = new XmlBeanFactory(new ClassPathResource("beans.xml"));
		Employee e1 = (Employee)bean.getBean("emp1");
		e1.display();
		
		Employee ee1 = (Employee)bean.getBean("emp1");
		ee1.display();
		
		Employee e2 = (Employee)bean.getBean("emp2");
		e2.display();
		
		Employee ee2 = (Employee)bean.getBean("emp2");
		ee2.display();
	}

}
