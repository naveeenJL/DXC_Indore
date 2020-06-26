package myjdbc;

import java.sql.*;

public class Example1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 
		 
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db?serverTimezone=UTC", "nav", "1234");
		 Statement stmt=con.createStatement();
		 ResultSet rs=stmt.executeQuery("select * from contact");
		 while(rs.next())
			 System.out.println(rs.getInt(1) + ", " + rs.getString(2) + ", " + rs.getString(3) + ", " + rs.getString(4));
		 
		 
	}

}
