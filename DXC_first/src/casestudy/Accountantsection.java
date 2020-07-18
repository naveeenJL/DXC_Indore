package casestudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.*;

public class Accountantsection {
	public static void showMessage(String Message)
	{
		System.out.println(Message);
	}


	public void addstudent(BufferedReader buff,Connection mConnection) throws Exception {
		// TODO Auto-generated method stub
		
		
		PreparedStatement stmtInsert = mConnection.prepareStatement("insert into students values(?,?,?,?,?,?,?,?,?)");
		showMessage("enter the name");
		stmtInsert.setString(1, buff.readLine());
		showMessage("enter the email");
		stmtInsert.setString(2, buff.readLine());
		showMessage("enter the course");
		stmtInsert.setString(3, buff.readLine());
		showMessage("enter the fee");
		stmtInsert.setString(4, buff.readLine());
		showMessage("enter the paid");
		stmtInsert.setString(5, buff.readLine());
		showMessage("enter the due");
		stmtInsert.setString(6, buff.readLine());
		showMessage("enter the address");
		stmtInsert.setString(7, buff.readLine());
		showMessage("enter the city");
		stmtInsert.setString(8, buff.readLine());
		
		showMessage("enter the contactno");
		stmtInsert.setString(9, buff.readLine());

		showMessage(stmtInsert.executeUpdate() + " No of Records Inserted");
		
		
	}

	

	public void viewstudent(BufferedReader buff,Connection mConnection) throws Exception {
		// TODO Auto-generated method stub
		
		Statement stmt=mConnection.createStatement();
		
		ResultSet rs=stmt.executeQuery("select * from students");
		while(rs.next())
			showMessage(rs.getString(1)+ " " +rs.getString(2)+ " " +rs.getString(3)+ " "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8)+" "+rs.getString(9)
			+" ");
		
		
	}

	public void editstudent(BufferedReader buff, Connection mConnection) throws Exception {
		// TODO Auto-generated method stub
		
		PreparedStatement stmtUpdate1 = mConnection.prepareStatement("update students   where student_name=?");
		showMessage("enter student name which has to edit");
		String name=buff.readLine();
		stmtUpdate1.setString(1, name);
		showMessage("SELECT THE FIELD WHICH YOU WANT TO EDIT : ");
		showMessage(" \n1. update email\n2. Update Course\n3. Update Fees\n4. Update Payment Paid\n5. Update Payment Due\n6. Update Address\n7. Update City\n8. Update ContactNo");
		String ch=buff.readLine();
		
		switch (Integer.parseInt(ch)) 
		{
		case 1:showMessage("update email");
		String email=buff.readLine();
		PreparedStatement stmtUpdate2 = mConnection.prepareStatement("update students set  student_email=? where student_name=?");
		stmtUpdate2.setString(1, email); 
		stmtUpdate2.setString(2, name); 
		showMessage(stmtUpdate2.executeUpdate()+ " No of Student Details Updated");
	
		break;
		case 2:showMessage("update course");
		String student_course=buff.readLine();
	
	    PreparedStatement stmtUpdate3 = mConnection.prepareStatement("update students set student_course=? where student_name=?");
		stmtUpdate3.setString(1, student_course); 
		stmtUpdate3.setString(2, name); 
		showMessage(stmtUpdate3.executeUpdate()+ " No of Student Details Updated");
	
			break ;
		case 3: 	showMessage("update fee");
			int student_fee=buff.read();
	    PreparedStatement stmtUpdate4 = mConnection.prepareStatement("update students set student_fee=? where student_name=?");
		stmtUpdate4.setInt(1, student_fee); 
		stmtUpdate4.setString(2, name); 
		showMessage(stmtUpdate4.executeUpdate() + " No of Student Details Updated");
	
			break ;
		case 4: showMessage("update paid");
		int student_paid=buff.read();
	    PreparedStatement stmtUpdate5 = mConnection.prepareStatement("update students set  student_paid=? where student_name=?");
		stmtUpdate5.setInt(1, student_paid); 
		stmtUpdate5.setString(2, name); 
		showMessage(stmtUpdate5.executeUpdate() + " No of Student Details Updated");
	
			break ;
		case 5: 	showMessage("update due");
		int student_due=buff.read();
	    PreparedStatement stmtUpdate6 = mConnection.prepareStatement("update students set student_due=? where student_name=?");
		stmtUpdate6.setInt(1, student_due); 
		stmtUpdate6.setString(2, name); 
		showMessage(stmtUpdate6.executeUpdate() + " No of Student Details Updated");
	
			break ;
		case 6: showMessage("update address");
		String student_address=buff.readLine();
	    PreparedStatement stmtUpdate7 = mConnection.prepareStatement("update students set student_address=? where student_name=?");
		stmtUpdate7.setString(1, student_address); 
		stmtUpdate7.setString(2, name); 
		showMessage(stmtUpdate7.executeUpdate() + " No of Student Details Updated");
	
			break ;
		case 7: showMessage("update city");
			String student_city=buff.readLine();
	    PreparedStatement stmtUpdate8 = mConnection.prepareStatement("update students set student_city=? where student_name=?");
		stmtUpdate8.setString(1, student_city); 
		stmtUpdate8.setString(2, name); 
		showMessage(stmtUpdate8.executeUpdate() + " No of Student Details Updated");
	
			break ;
		
	
		case 8: showMessage("update contactno");
			int student_contactno=buff.read();
	    PreparedStatement stmtUpdate9 = mConnection.prepareStatement("update students set student_contactno=? where student_name=?");
		stmtUpdate9.setInt(1, student_contactno); 
		stmtUpdate9.setString(2, name); 
		showMessage(stmtUpdate9.executeUpdate() + " No of Student Details Updated");
	
			break ;
			
		}
		
		}
	

	public void dueefees(BufferedReader buff,Connection mConnection) throws Exception {
		// TODO Auto-generated method stub
		
		Statement stmt=mConnection.createStatement();
		ResultSet rs=stmt.executeQuery("select * from students where student_due!=0");
		while(rs.next())
			showMessage(rs.getString(1)+ " " +rs.getString(2)+ " " +rs.getString(3)+ " "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8)+" "+rs.getString(9)
			+" ");		
		
		
		
	}

	public void logout(BufferedReader buff) throws Exception {
		// TODO Auto-generated method stub
		String continueChoice;
		boolean transaction=true;
		showMessage("Do you Want to logout\nlogout \nNo");
		continueChoice =buff.readLine();
		if(continueChoice.equalsIgnoreCase("logout"))
			transaction=false;
			
		
	}


	public void delete(BufferedReader buff, Connection mConnection) throws Exception {
		// TODO Auto-generated method stub
		String sql="delete from students where student_name=?";
		
		PreparedStatement pstmt = mConnection.prepareStatement(sql);
		showMessage("enter the student name you want to delete");
		String name=buff.readLine();
		pstmt.setString(1, name);
		pstmt.executeUpdate();
		showMessage("records deleted succesfully");
		
		
	}

}
