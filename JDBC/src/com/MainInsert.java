package com;

import java.sql.*;

class MainInsert {
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/Students";
		String user = "root";
		String pass = "tiger";
		String query = "insert into students values(103, 'Out', 76.9, 'Biology');";

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
				System.out.println("Insertion Successful "+rows+" row(s) affected");
			} else {
				System.out.println("Insertion Failed");
			}
			
			stmt.close();
			con.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());		
			}
	}
}
