package com.connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class GroupBy {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/divya";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		if (con != null)
			System.out.println("Connection established");
		Statement st = con.createStatement();
		String groupby="select max(marks) ,section from student group by section";
		ResultSet rs=st.executeQuery(groupby);
		System.out.println("Maximum     ||   section");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"     ||     "+rs.getString(2));
		}
	}
}
