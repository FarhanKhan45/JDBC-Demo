package com.jdbc.jdbc_demo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
	public static void main(String[] args) {

		String url = "jdbc:postgresql://localhost:5432/demo_db";
		String user = "postgres";
		String password = "root";
    try {
    	
    	Class.forName("org.postgresql.Driver");
    	System.out.println("Driver loaded");
    	
    	Connection conn=DriverManager.getConnection(url, user, password);
    	
    	Statement smt=conn.createStatement();
    	String update="UPDATE student SET email='farhan991134@gmail.com' WHERE id=6";
    	int r =smt.executeUpdate(update);
    	System.out.println("row updated"+r);
    	
    	conn.close();
    	
    	
    }
  catch (ClassNotFoundException e) {
	e.printStackTrace();
	} catch (SQLException e) {
	e.printStackTrace();
}
	}
}
