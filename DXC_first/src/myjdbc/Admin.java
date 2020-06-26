package myjdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.*;

public class Admin {

	public void login(BufferedReader buff) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("enter the USERNAME");
		String user_name=buff.readLine();
		System.out.println("enter your PASSWORD");
		String password=buff.readLine();
		System.out.println("admin login successful\n");
		
	}

	public void addaccountant(BufferedReader buff) throws  Exception {
		// TODO Auto-generated method stub
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/accountantdb?serverTimezone=UTC", "nav", "1234");
		
		PreparedStatement stmtInsert = con.prepareStatement("insert into accountant values(?,?,?,?)");
		System.out.println("enter the name");
		stmtInsert.setString(1, buff.readLine());
		System.out.println("enter the password");
		stmtInsert.setString(2, buff.readLine());
		System.out.println("enter the email");
		stmtInsert.setString(3, buff.readLine());
		System.out.println("enter the contact_number");
		stmtInsert.setString(4, buff.readLine());

		System.out.println(stmtInsert.executeUpdate() + " No of Records Inserted");

		
	}

	public void viewaccountant(BufferedReader buff) throws Exception {
		// TODO Auto-generated method stub
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/accountantdb?serverTimezone=UTC", "nav", "1234");
		
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from accountant");
		while(rs.next())
			System.out.println(rs.getString(1)+ " " +rs.getString(2)+ " " +rs.getString(3)+ " "+rs.getString(4));
		con.close();
	}

	public void logout(BufferedReader buff) throws Exception {
		// TODO Auto-generated method stub
		String continueChoice;
		boolean transaction=true;
		System.out.println("Do you Want to logout\nlogout \nNo");
		continueChoice =buff.readLine();
		if(continueChoice.equalsIgnoreCase("logout"))
			transaction=false;
			
		
	}
	

}
