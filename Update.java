package com.connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Update {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/motivity";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, username, password);
		if (con != null)
			System.out.println("Connection established");
		Statement st = con.createStatement();
		System.out.println("Where to update:\n1. name:\n2. marks\n3. section using id:");
		int choice = sc.nextInt();
		if (choice == 1) {
			System.out.println("Enter Name:");
			String name = sc.next();
			name += " " + sc.next();
			System.out.println("Enter id:");
			int id = sc.nextInt();
			String update = "update student set name='" + name + "' where sid=" + id;
			int a = st.executeUpdate(update);
			if (a != 0)
				System.out.println("Updated");
		} else if (choice == 2) {
			System.out.println("Enter how many marks should update for one student:");
			int increment = sc.nextInt();
			System.out.println("Enter id:");
			int id = sc.nextInt();
			String update = "update student set marks=marks+" + increment+" where sid="+id;
			int a = st.executeUpdate(update);
			if (a != 0)
				System.out.println("Updated");
		} else if (choice == 3) {
			System.out.println("Enter Section:");
			String section = sc.next();
			System.out.println("Enter id:");
			int id = sc.nextInt();
			String update = "update student set section='" + section + "' where sid=" + id;
			int a = st.executeUpdate(update);
			if (a != 0)
				System.out.println("Updated");
		} else {
			System.out.println("enter ur option in between 1 to n");
		}
	}
}
