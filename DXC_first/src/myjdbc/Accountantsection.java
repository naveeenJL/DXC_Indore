package myjdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.*;

public class Accountantsection {

	public void addstudent(BufferedReader buff) throws Exception {
		// TODO Auto-generated method stub
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentsdb?serverTimezone=UTC","nav", "1234");
		PreparedStatement stmtInsert = con.prepareStatement("insert into student values(?,?,?,?,?,?,?,?,?,?,?)");
		System.out.println("enter the name");
		stmtInsert.setString(1, buff.readLine());
		System.out.println("enter the email");
		stmtInsert.setString(2, buff.readLine());
		System.out.println("enter the course");
		stmtInsert.setString(3, buff.readLine());
		System.out.println("enter the fee");
		stmtInsert.setString(4, buff.readLine());
		System.out.println("enter the paid");
		stmtInsert.setString(5, buff.readLine());
		System.out.println("enter the due");
		stmtInsert.setString(6, buff.readLine());
		System.out.println("enter the address");
		stmtInsert.setString(7, buff.readLine());
		System.out.println("enter the city");
		stmtInsert.setString(8, buff.readLine());
		System.out.println("enter the state");
		stmtInsert.setString(9, buff.readLine());
		System.out.println("enter the country");
		stmtInsert.setString(10, buff.readLine());
		System.out.println("enter the contactno");
		stmtInsert.setString(11, buff.readLine());

		System.out.println(stmtInsert.executeUpdate() + " No of Records Inserted");
		
	}

	public void viewstudent(BufferedReader buff) throws Exception {
		// TODO Auto-generated method stub
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentsdb?serverTimezone=UTC","nav", "1234");
		Statement stmt=con.createStatement();
		
		ResultSet rs=stmt.executeQuery("select * from student");
		while(rs.next())
			System.out.println(rs.getString(1)+ " " +rs.getString(2)+ " " +rs.getString(3)+ " "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8)+" "+rs.getString(9)
			+" "+rs.getString(10)+" "+rs.getString(11));
		con.close();
		
	}

	public void editstudent(BufferedReader buff) throws Exception {
		// TODO Auto-generated method stub
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentsdb?serverTimezone=UTC","nav", "1234");
		Statement stmt=con.createStatement();
		PreparedStatement stmtUpdate = con.prepareStatement("update student  ");
		stmtUpdate.setString(1, buff.readLine());
		stmtUpdate.setString(2, buff.readLine());
		stmtUpdate.setString(3, buff.readLine());
		stmtUpdate.setString(4, buff.readLine());
		stmtUpdate.setString(5, buff.readLine());
		stmtUpdate.setString(6, buff.readLine());
		stmtUpdate.setString(7, buff.readLine());
		stmtUpdate.setString(8, buff.readLine());
		stmtUpdate.setString(9, buff.readLine());
		stmtUpdate.setString(10, buff.readLine());
		stmtUpdate.setString(11, buff.readLine());
	}

	public void dueefees(BufferedReader buff) throws Exception {
		// TODO Auto-generated method stub
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentsdb?serverTimezone=UTC","nav", "1234");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select student_due from student");
		while(rs.next())
			System.out.println(rs.getString(6));
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
