package com.jdbc.jdbc_demo;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Fetch{
	public static void main(String[] args) {

		String url = "jdbc:postgresql://localhost:5432/demo_db";
		String user = "postgres";
		String password = "root";
		Connection conn=null;
    try {
    	
    	Class.forName("org.postgresql.Driver");
    	System.out.println("Driver loaded");
    	
    	 conn = DriverManager.getConnection(url, user, password);
    	
    	Statement smt=conn.createStatement();
    	String fetch="select * from student";
    	ResultSet rs =smt.executeQuery(fetch);
    	System.out.println("Student --------------------------");
    	while(rs.next()) {
    		System.out.println("SID : " + rs.getInt("id") );
    		System.out.println("NAME: " + rs.getString(2) );
    		System.out.println("EMAIL : " + rs.getString(3) );
    		System.out.println("PHONE: " + rs.getLong(4) );
    		System.out.println("=================================");
    	}
    	
    	
    	System.out.println("record fetched succsesfully");
    	
    	
    }
  catch (ClassNotFoundException e) {
	e.printStackTrace();
	} catch (SQLException e) {
	e.printStackTrace();
}
    finally {
    	try {
    	if(conn!=null) {
    		conn.close();
    	}
    }catch(SQLException ex) {
    	ex.printStackTrace();
    }}
	}
}
