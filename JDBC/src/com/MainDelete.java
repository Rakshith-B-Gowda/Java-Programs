package com;

import java.sql.*;

class MainDelete {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/Students";
		String user = "root";
		String pass = "tiger";
		String query = "delete from students where rollno = 103;";

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
				System.out.println("Deletion Successful "+rows+" row(s) affected.");
			} else {

			}
			stmt.close();
			con.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());	
		}
		
	}
}
