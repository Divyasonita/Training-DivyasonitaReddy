package com.connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class OrderBy {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/divya";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		if (con != null)
			System.out.println("Connection established");
		Statement st = con.createStatement();
		System.out.println("order by:\n1. descending\n2. ascending");
		int choice = sc.nextInt();
		if(choice == 1) {
			System.out.println("enter coloumn name for oder by:");
			String colname=sc.next();
			String orderby="select * from student order by "+colname+" desc";
			ResultSet rs=st.executeQuery(orderby);
			System.out.println("Student id     ||     Student Name     ||     Student Marks     ||     Student Section");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"     ||     "+rs.getString(2)+"     ||     "+rs.getInt(3)+"     ||     "+rs.getString(4));
			}
		}else if(choice == 2) {
			System.out.println("enter coloumn name for oder by:");
			String colname=sc.next();
			String orderby="select * from student order by "+colname+" asc";
			ResultSet rs=st.executeQuery(orderby);
			System.out.println("Student id     ||     Student Name     ||     Student Marks     ||     Student Section");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"     ||     "+rs.getString(2)+"     ||     "+rs.getInt(3)+"     ||     "+rs.getString(4));
			}
		}
	}
}
