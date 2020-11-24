package com.connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Query {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/divya";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		if (con != null)
			System.out.println("Connection established");
		Statement st = con.createStatement();
		String subquery="select * from customers where id not in (select cid from orders)";
		ResultSet rs=st.executeQuery(subquery);
		System.out.println("Id     ||   Customer Name");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"     ||     "+rs.getString(2));
		}
	}
}
