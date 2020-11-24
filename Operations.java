package com.connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Operations {
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/divya";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		if (con != null)
			System.out.println("Connection established");
		Statement st = con.createStatement();
			String operations="select sum(marks) ,avg(marks) ,min(marks) ,max(marks) ,count(*) from student";
			ResultSet rs=st.executeQuery(operations);
			System.out.println("total     ||     avarage     ||     Minimum     ||     Maximum     ||     Count");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"     ||     "+rs.getInt(2)+"            ||     "+rs.getInt(3)+"               ||     "+rs.getInt(4)+"                ||     "+rs.getInt(5));
			}
		
	}
}
