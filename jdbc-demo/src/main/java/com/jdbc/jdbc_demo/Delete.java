package com.jdbc.jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
	public static void main(String[] args) {

		String url = "jdbc:postgresql://localhost:5432/demo_db";
		String user = "postgres";
		String password = "root";
    try {
    	
    	Class.forName("org.postgresql.Driver");
    	System.out.println("Driver loaded");
    	
    	Connection conn=DriverManager.getConnection(url, user, password);
    	
    	Statement smt=conn.createStatement();
    	String delete="DELETE FROM student where id=5";
    	smt.execute(delete);
    
    	
    	conn.close();
    	System.out.println("record deleted and connection closed");
    	
    }
  catch (ClassNotFoundException e) {
	e.printStackTrace();
	} catch (SQLException e) {
	e.printStackTrace();
}
	}
}
