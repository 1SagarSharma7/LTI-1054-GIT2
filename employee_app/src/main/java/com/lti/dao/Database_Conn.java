package com.lti.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database_Conn {
	public static Connection getconn() throws SQLException {

		Connection conn = DriverManager.getConnection("jdbc:oracle:thin@localhost:1521:ORCL", "system", "##1NumbeR$##");
		
		if(conn != null) {
			System.out.println();
			System.out.println("connected");
		}
		return conn;
		
	}
	
	public static void main(String[] args) throws SQLException {
		getconn();
	}
}
