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
		int res = stmt.executeUpdate("insert into employee values(5,'Mahesh',28000)");
		if(res>0) {
			System.out.println("Record inserted successfully");
		}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
