package com;
import java.sql.*;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded successfully");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_database", "root", "root@123");
		System.out.println("Database connected...");
		
		Statement stmt = con.createStatement();
		
		//Insert Query 
//		int res = stmt.executeUpdate("insert into employee values(5,'Mahesh',28000)");
//		if(res>0) {
//			System.out.println("Record inserted successfully");
//		}
		
//		// Delete Query 
//		int res = stmt.executeUpdate("delete from employee where id = 5");
//		if(res>0) {
//			System.out.println("Record deleted successfully");
//		}else {
//			System.out.println("Record not present");
//		}
		
		// updatet Query 
//		int res = stmt.executeUpdate("update employee set salary = 35000 where id = 1");
//		if(res>0) {
//			System.out.println("Record updated successfully");
//		}else {
//			System.out.println("Record not present");
//		}
		// Retrieve Query 
		
		ResultSet rs = stmt.executeQuery("select * from employee");
		while(rs.next()) {
			System.out.println("id is "+rs.getInt("id")+" Name is "+rs.getString("name")+" Salary is "+rs.getFloat("salary"));
		}
		
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
