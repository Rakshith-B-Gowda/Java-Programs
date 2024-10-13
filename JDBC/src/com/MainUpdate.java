package com;

import java.sql.*;

class MainUpdate {
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/Students";
		String user = "root";
		String pass = "tiger";
		String query = "update students"
				+ " set marks=35.0 , subject='Kannada'"
				+ " where rollno=102;";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stmt = con.createStatement();
			int rows = stmt.executeUpdate(query);
			if (rows > 0) {
				System.out.println("UPDATE Successful "+rows+" row(s) affected.");
			} else {
				System.out.println("UPDATE Failed!!");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
