package com.bridgelabz.Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDemo {
	
    public static void main( String[] args ) {
    	String jdbcURL = "jdbc:mysql://localhost:3306/payroll_service?user=root&password=sonaligadge24@";
    	String query = "insert into payroll_service.employee_payroll values(4, 'Harry', 'M', 500000.00, '2021-04-06')";
    	
    	try {
			Connection connection = DriverManager.getConnection(jdbcURL);
			System.out.println("Connection Established!");
			Statement statement = connection.createStatement();
			System.out.println("Platform created sucessfully!");
			statement.execute(query);
			System.out.println("Execution Successfull!");
		} catch (SQLException e) {
			System.out.println("Cannot find the driver!");
			e.printStackTrace();
		}
    	
}
}