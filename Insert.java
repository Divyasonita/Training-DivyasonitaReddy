package com.connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Insert {
	
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
		System.out.println("enter no of students:");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.println("enter id:");
			int id=sc.nextInt();
			System.out.println("enter FirstName:");
			String name=sc.next();
			System.out.println("enter LastName:");
			name+=" "+sc.next();
			System.out.println("enter Marks:");
			int marks=sc.nextInt();
			System.out.println("enter Section:");
			String section=sc.next();
			String insert="insert into student values("+id+",'"+name+"',"+marks+",'"+section+"')";
			int a = st.executeUpdate(insert);
			if (a != 0)
				System.out.println("inserted");
		}
	}
}
