package com.connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Delete {

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
		System.out.println("Delete for 1. single or 2. multiple");
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.println("Enter your id:");
			int id=sc.nextInt();
			String delete="delete from student where sid="+id;
			int a = st.executeUpdate(delete);
			if (a != 0)
				System.out.println("deleted");
		}else if(choice == 2) {
			System.out.println("enter number of students:");
			int size=sc.nextInt();
			System.out.println("enter student ids:");
			String ids="";
			for(int i=0;i<size;i++) {
				ids+=","+sc.next();
			}
			ids=ids.substring(1, ids.length());
			String delete="delete from student where sid in("+ids+")";
			int a = st.executeUpdate(delete);
			if (a != 0)
				System.out.println("deleted");
		}else {
			System.out.println("enter your choice in give menu");
		}
		
	}
}
