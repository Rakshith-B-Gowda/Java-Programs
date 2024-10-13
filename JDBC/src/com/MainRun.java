package com;

import java.sql.*;

class MainRun {
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/Students";
		String user = "root";
		String password = "tiger";
		String query = "select * from students";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Drivers Loaded Successfully");
		} 
		catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("Connection Established Successfully");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			System.out.println("------");
			
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				double marks = rs.getDouble("marks");
				String subject = rs.getString("subject");
				
				System.out.println("RollNo: "+id+" Name: "+name+" Marks: "+marks+" Subject: "+subject);
				
			}
			
			rs.close();
			stmt.close();
			con.close();
			
			System.out.println("\nConnections Closed Successfully!!");
			
		} 
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
