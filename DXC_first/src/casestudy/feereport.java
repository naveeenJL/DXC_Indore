package casestudy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


class userClass<T> { 
	T obj;

	void create(T obj) { 
		this.obj = obj;
	}

	T getInstance() { 
		return obj;
	}

}

public class feereport {
	
	Connection mConnectionObject;
	public Connection getInstance() throws Exception {
		if(mConnectionObject==null)
		{
			Class.forName("com.mysql.jdbc.Driver");
			mConnectionObject=DriverManager.getConnection("jdbc:mysql://localhost:3306/casedb?serverTimezone=UTC", "nav", "1234");
			return mConnectionObject;
		}
		else
			return mConnectionObject;
		}


	InputStreamReader isr = null;
	BufferedReader buff = null;
	Admin mAdmin = null;
	Accountantsection mAccountantsection=null;
	
	String userchoice;
	String clientchoice;
	public static void showMessage(String Message)
	{
		System.out.println(Message);
	}
	
	public static void main(String[] args) throws Exception {

		feereport mFrObject = new feereport();

		mFrObject.isr = new InputStreamReader(System.in);
		mFrObject.buff = new BufferedReader(mFrObject.isr);
	
		
		
		String continueChoice;
		boolean transaction=true;
		boolean repeat=true;
		
			do {
				
			showMessage("Welcome to FEES REPORT SYSTEM\n");
			showMessage("SELECT your USER  choice\n1.Admin Section\n2.Accountant Section\n");
			String muserchoice = mFrObject.buff.readLine();

			
			switch (Integer.parseInt(muserchoice)) {
			case 1:
				userClass<Admin> obj = new userClass<Admin>();
				obj.create(new Admin());
				mFrObject.mAdmin = obj.getInstance();
				
				
				do{
					
					showMessage("WELCOME TO ADMIN SECTION\n");
					showMessage("select your section\n 1.ADD ACCOUNTANT \n 2.VIEW ACCOUNTANT \n 3.EDIT ACCOUNTANT \n 4.DELETE ACCOUNTANT\n 5.LOGOUT");
				String clientchoice=mFrObject.buff.readLine();
				
				switch(Integer.parseInt(clientchoice)) {
				case 1: mFrObject.mAdmin.addaccountant(mFrObject.buff,mFrObject.getInstance());
				break;
				case 2: mFrObject.mAdmin.viewaccountant(mFrObject.buff,mFrObject.getInstance());
				break;
				case 3: mFrObject.mAdmin.editaccountant(mFrObject.buff, mFrObject.getInstance());
				break;
				case 4: mFrObject.mAdmin.deleteaccountant(mFrObject.buff, mFrObject.getInstance());
				break;
				case 5: mFrObject.mAdmin.logout(mFrObject.buff);
				break;
				default:
					showMessage("task is not performed");
				
				}showMessage("Do you Want to Continue\nYes\nNo");
				continueChoice = mFrObject.buff.readLine();
				if (continueChoice.equalsIgnoreCase("No"))
					transaction = false;
				}while(transaction);
				break;
				
			case 2:
				userClass<Accountantsection> obj1=new userClass<Accountantsection>();
				obj1.create(new Accountantsection());
				mFrObject.mAccountantsection=obj1.getInstance();
				do {
					showMessage("welcome to accountant section\n");
					showMessage("select your choice\n 1.ADD STUDENT \n 2.VIEW STUDENT \n 3.EDIT STUDENT \n 4.DUE FESS \n 5.DELETE STUDENT \n 6.LOGOUT");
				String clientchoice1=mFrObject.buff.readLine();
				
				switch(Integer.parseInt(clientchoice1)) {
					case 1: mFrObject.mAccountantsection.addstudent(mFrObject.buff,mFrObject.getInstance());
					break;
					case 2: mFrObject.mAccountantsection.viewstudent(mFrObject.buff,mFrObject.getInstance());
					break;
					case 3: mFrObject.mAccountantsection.editstudent(mFrObject.buff,mFrObject.getInstance());
					break;
					case 4: mFrObject.mAccountantsection.dueefees(mFrObject.buff,mFrObject.getInstance());
					break;
					case 5: mFrObject.mAccountantsection.delete(mFrObject.buff, mFrObject.getInstance());
					break;
					case 6: mFrObject.mAccountantsection.logout(mFrObject.buff);
					break;
					default: showMessage("task not completed");
				}System.out.println("Do you Want to Continue\nYes\nNo");
				continueChoice = mFrObject.buff.readLine();
				if (continueChoice.equalsIgnoreCase("No"))
					transaction = false;
					
				}while(transaction);
				break;
				default: showMessage("select atleast one task\n");
			}showMessage("Do you Want to End feemanagement\nYes\nNo");
			 mFrObject.userchoice = mFrObject.buff.readLine();
			if (mFrObject.userchoice.equalsIgnoreCase("yes"))
				repeat = false;
			}while(repeat);
			
			showMessage("*************THANK YOU FOR USING THIS APPLICATION*************");
	}
}
				