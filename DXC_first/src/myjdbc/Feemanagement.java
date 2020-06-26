package myjdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
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

public class Feemanagement {

	InputStreamReader isr = null;
	BufferedReader buff = null;
	Admin Ma = null;
	Accountantsection as=null;
	
	String userchoice;
	String clientchoice;
	
	
	

	public static void main(String[] args) throws Exception {

		Feemanagement mObject = new Feemanagement();

		mObject.isr = new InputStreamReader(System.in);
		mObject.buff = new BufferedReader(mObject.isr);
		String continueChoice;
		boolean transaction=true;
		boolean repeat=true;
		
			do {
				
			System.out.println("Welcome to FEES MANAGEMENT SYSTEM\n");
			System.out.println("SELECT your USE2"
					+ "R choice\n1.Admin\n2.Accountant Section\n");
			String muserchoice = mObject.buff.readLine();

			
			switch (Integer.parseInt(muserchoice)) {
			case 1:
				userClass<Admin> obj = new userClass<Admin>();
				obj.create(new Admin());
				mObject.Ma = obj.getInstance();
				
				System.out.println(" Admin login PAGE\n");
				do{
					mObject.Ma.login(mObject.buff);
				System.out.println("ADMIN SECTION\n");
				System.out.println("select your section\n 1.ADD ACCOUNTANT \n 2.VIEW ACCOUNTANT \n 3.LOGOUT");
				String clientchoice=mObject.buff.readLine();
				
				switch(Integer.parseInt(clientchoice)) {
				case 1: mObject.Ma.addaccountant(mObject.buff);
				break;
				case 2: mObject.Ma.viewaccountant(mObject.buff);
				break;
				case 3: mObject.Ma.logout(mObject.buff);
				break;
				default:
					System.out.println("task is not performed");
				
				}System.out.println("Do you Want to Continue\nYes\nNo");
				continueChoice = mObject.buff.readLine();
				if (continueChoice.equalsIgnoreCase("No"))
					transaction = false;
				}while(transaction);
				break;
				
			case 2:
				userClass<Accountantsection> obj1=new userClass<Accountantsection>();
				obj1.create(new Accountantsection());
				mObject.as=obj1.getInstance();
				do {
				System.out.println("select your choice\n 1.ADD STUDENT \n 2.VIEW STUDENT \n 3.EDIT STUDENT \n 4.DUE FESS \n 5.LOGOUT");
				String clientchoice1=mObject.buff.readLine();
				
				switch(Integer.parseInt(clientchoice1)) {
					case 1: mObject.as.addstudent(mObject.buff);
					break;
					case 2: mObject.as.viewstudent(mObject.buff);
					break;
					case 3: mObject.as.editstudent(mObject.buff);
					break;
					case 4: mObject.as.dueefees(mObject.buff);
					break;
					case 5: mObject.as.logout(mObject.buff);
					break;
					default: System.out.println("task not completed");
				}System.out.println("Do you Want to Continue\nYes\nNo");
				continueChoice = mObject.buff.readLine();
				if (continueChoice.equalsIgnoreCase("No"))
					transaction = false;
					
				}while(transaction);
				break;
				default: System.out.println("select atleast one task\n");
			}System.out.println("Do you Want to End feemanagement\nYes\nNo");
			 mObject.userchoice = mObject.buff.readLine();
			if (mObject.userchoice.equalsIgnoreCase("yes"))
				repeat = false;
			}while(repeat);
			
			System.out.println("*************THANK YOU FOR USING THIS APPLICATION*************");
	}
}
				