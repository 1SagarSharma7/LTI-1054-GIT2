package com.lti.Employee;

import java.sql.SQLException;
import com.lti.dao.Employee_Dao;
import com.lti.entity.Employee;


public class App {
	
	public static void main(String[] args) throws SQLException {
		System.out.println("Hello world");
		Employee_Dao dao = new Employee_Dao();
		Employee e1 = new Employee();
		e1.setUsername("sagar");
		e1.setPassword("sagar123");
		e1.setEmail("sagar@lti.com");
		dao.addEmp(e1);
		System.out.println("employee added successfully");
	}
	
}
