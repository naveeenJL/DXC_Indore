package resultmanagment;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class MyStream <T> { 
	T obj;
	
	void create(T obj) { 
		this.obj = obj;
	}
	
	T getInstance() { 
		return obj;
	}
}

public class ResultManagment 
{
	InputStreamReader isr = null;
	BufferedReader buff = null;
	Science sc=null;
	Commerce cm=null;
	Arts hu=null;
	
	List<StudentDataBase> mStudentList = new ArrayList<StudentDataBase>();
	
	public static void main(String[] args) throws Exception
	{
		ResultManagment rm=new ResultManagment();
		
		rm.isr = new InputStreamReader(System.in);
		rm.buff = new BufferedReader(rm.isr);
		
			StudentDataBase sm = new StudentDataBase();
			System.out.println("Welcome to RESULT SYSTEM\n");
			System.out.println("SELECT  YOUR STREAM\n1. SCIENCE\n2. COMMERCE\n3. Arts");
			String streamchoice = rm.buff.readLine();

			String mOperationChoice, continueChoice;
			boolean result = true;

			switch(Integer.parseInt(streamchoice))
			{
			case 1: MyStream<Arts> obj = new MyStream<Arts>();
					obj.create(new Arts());
					rm.hu = obj.getInstance();
					do {
						System.out.println("SELECT  YOUR  Operation\n1. YourResult\n2. YourStreamTopper\n3. OverAllStreamTopper");
						mOperationChoice = rm.buff.readLine();
						switch(Integer.parseInt(mOperationChoice)) {
						
						case 1 : rm.hu.YourResult(rm.buff, sm);
								 break;
						
						case 2 : 
								 break;
						
						case 3 :
							     break;
						default: System.out.println("No Operation Choice Selected");
						}
						System.out.println("Do you Want to Continue\nYes\nNo");
						continueChoice = rm.buff.readLine();
						if(continueChoice.equalsIgnoreCase("No"))
						result = false;
					
					}while(result);
					break;
					
			case 2: MyStream<Science> obj1 = new MyStream<Science>();
					obj1.create(new Science());
					rm.sc = obj1.getInstance();
			do {
					System.out.println("SELECT  YOUR  Operation\n1. YourResult\n2. YourStreamTopper\n3. OverAllStreamTopper");
					mOperationChoice = rm.buff.readLine();
					switch(Integer.parseInt(mOperationChoice)) 
					{
					case 1 : rm.hu.YourResult(rm.buff, sm);
							 break;
					
					case 2 : 
							 break;
					
					case 3 :
						     break;
					
					default: System.out.println("No Operation Choice Selected");
					}
					
						System.out.println("Do you Want to Continue\nYes\nNo");
						continueChoice = rm.buff.readLine();
						if(continueChoice.equalsIgnoreCase("No"))
						result = false;
				}
					while(result);
					break;	
			
			case 3: MyStream<Commerce> obj2 = new MyStream<Commerce>();
					obj2.create(new Commerce());
					rm.cm = obj2.getInstance();
			do {
					System.out.println("SELECT  YOUR  Operation\n1. YourResult\n2. YourStreamTopper\n3. OverAllStreamTopper");
					mOperationChoice = rm.buff.readLine();
					switch(Integer.parseInt(mOperationChoice)) 
					{
					case 1 : rm.hu.YourResult(rm.buff, sm);
							 break;
					
					case 2 : 
							 break;
					
					case 3 :
						     break;
					
					default: System.out.println("No Operation Choice Selected");
					}
					
						System.out.println("Do you Want to Continue\nYes\nNo");
						continueChoice = rm.buff.readLine();
						if(continueChoice.equalsIgnoreCase("No"))
						result = false;
				}
					while(result);
					break;	
			  }
		}
	}
