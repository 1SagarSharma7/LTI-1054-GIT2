package com.lti.Employee;



//import static org.junit.Assert.*;
//import com.lti.dao.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.lti.dao.Database_Conn;

public class App_test {

	@Test
	public void getConnectionTest() throws SQLException {
		Connection conn = Database_Conn.getconn();
		assertNotNull(conn, "connection successful");
	}
	
	@Test
	public void addEmptest() throws SQLException{
		Employee emp = new Employee();
		emp.setUsername("emp");
		emp.setPassword("emppass");
		emp.setEmail("emp@email");
		Connection conn = Database_Conn.getconn();
		Employee_Dao dao = new Employee_Dao();
		dao.addEmp(emp);
		Employee empfromdb = dao.getEmpbyname("emp");
		assertEquals("emppass", empfromdb.getPassword(), "password checked successful");
		
		
	}

}
