package casestudy;

import java.io.BufferedReader;

import java.io.IOException;
import java.sql.*;




public class Admin {
	public static void showMessage(String Message)
	{
		System.out.println(Message);
	}

	

	public void addaccountant(BufferedReader buff, Connection mConnection) throws  Exception {
		// TODO Auto-generated method stub
		
		PreparedStatement stmtInsert = mConnection.prepareStatement("insert into accountant values(?,?,?,?)");
		showMessage("enter the name");
		stmtInsert.setString(1, buff.readLine());
		showMessage("enter the password");
		stmtInsert.setString(2, buff.readLine());
		showMessage("enter the email");
		stmtInsert.setString(3, buff.readLine());
		showMessage("enter the contact_number");
		stmtInsert.setString(4, buff.readLine());

		showMessage(stmtInsert.executeUpdate() + " No of Records Inserted");

		
	}

	public void viewaccountant(BufferedReader buff, Connection mConnection) throws Exception {
		// TODO Auto-generated method stub
		
		Statement stmt=mConnection.createStatement();
		ResultSet rs=stmt.executeQuery("select * from accountant");
		while(rs.next())
			showMessage(rs.getString(1)+ " " +rs.getString(2)+ " " +rs.getString(3)+ " "+rs.getString(4));
		
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

	public void editaccountant(BufferedReader buff, Connection mConnection) throws Exception {
		// TODO Auto-generated method stub
		PreparedStatement stmtUpdate1 = mConnection.prepareStatement("update accountant   where accountant_name=?");
		showMessage("enter accountant name which has to edit");
		String aname=buff.readLine();
		stmtUpdate1.setString(1, aname);
		showMessage("SELECT THE FIELD WHICH YOU WANT TO EDIT: ");
		showMessage(" \n1.password \n2.email \n3.contact_number");
		String ch=buff.readLine();
		switch(Integer.parseInt(ch))
		{
		case 1:showMessage("update password");
		String password=buff.readLine();
		PreparedStatement stmtUpdate11 = mConnection.prepareStatement("update accountant set  accountant_password=? where accountant_name=?");
		stmtUpdate11.setString(1, password); 
		stmtUpdate11.setString(2, aname); 
		showMessage(stmtUpdate11.executeUpdate()+ " No of accountant Details Updated");
		break;
		case 2: showMessage("update email");
		String email=buff.readLine();
		PreparedStatement stmtUpdate2 = mConnection.prepareStatement("update accountant set  accountant_email=? where accountant_name=?");
		stmtUpdate2.setString(1, email); 
		stmtUpdate2.setString(2, aname); 
		showMessage(stmtUpdate2.executeUpdate()+ " No of accountant Details Updated");
		break;
		case 3: showMessage("update email");
		String phone_number=buff.readLine();
		PreparedStatement stmtUpdate3 = mConnection.prepareStatement("update accountant set  accountant_phone_number=? where accountant_name=?");
		stmtUpdate3.setString(1, phone_number); 
		stmtUpdate3.setString(2, aname); 
		showMessage(stmtUpdate3.executeUpdate()+ " No of accountant Details Updated");
		break;
	
		}
		
	}



	public void deleteaccountant(BufferedReader buff, Connection mConnection) throws Exception {
		// TODO Auto-generated method stub
		
		String sql="delete from accountant where accountant_name=?";
		
		PreparedStatement pstmt = mConnection.prepareStatement(sql);
		showMessage("enter the accountant name you want to delete");
		String name=buff.readLine();
		pstmt.setString(1, name);
		pstmt.executeUpdate();
		showMessage("records deleted succesfully");
		
	
		
		
		
	}
	

}
