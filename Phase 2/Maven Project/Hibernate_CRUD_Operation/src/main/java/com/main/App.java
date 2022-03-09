package com.main;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import com.bean.Employee;
import com.service.EmployeeService;
public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id;
		String name;
		float salary;
		String con="";
		int choice;
		EmployeeService es = new EmployeeService();
		do {
				System.out.println("1:Display All");
				System.out.println("Enter your choice");
				choice = sc.nextInt();
				switch (choice) {
				case 1:List<Employee> listOfEmp = es.getAllEmployee();
					   Iterator<Employee> li  = listOfEmp.iterator();
					   while(li.hasNext()) {
						   Employee emp = li.next();
						   System.out.println(emp);
					   }
					break;

				default:	System.out.println("Wrong choice");
					break;
				}
			System.out.println("Do you want to continue?");
			con = sc.next();
		} while (con.equals("y"));
	}

}
