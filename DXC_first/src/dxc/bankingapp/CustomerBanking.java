package dxc.bankingapp;


	import java.io.BufferedReader;
	import java.io.InputStreamReader;

	class MyBankClass <T> {
		T obj;
		
		void create(T obj) {
			this.obj = obj;
		}
		
		T getInstance() {
			return obj;
		}
	}

	public class CustomerBanking {

		InputStreamReader isr = null;
		BufferedReader buff = null;
		ICICI mICICI = null;
		HDFC mHDFC = null;
		AXIS mAXIS = null;
		
		public static void main(String[] args) throws Exception {
			
			CustomerBanking mObject = new CustomerBanking();
			
			mObject.isr = new InputStreamReader(System.in);
			mObject.buff = new BufferedReader(mObject.isr);
			
			System.out.println("Welcome to INDIAN BANKING SYSTEM\n");
			System.out.println("SELECT  YOUR BANK\n1. ICICI\n2. HDFC\n3. AXIS");
			String mBankChoice = mObject.buff.readLine();
			String mOperationChoice,ContinueChoice;
			boolean transaction=true;
			
			
			switch(Integer.parseInt(mBankChoice))
			{
			case 1: MyBankClass<ICICI> obj = new MyBankClass<ICICI>();
					obj.create(new ICICI());
					mObject.mICICI = obj.getInstance();
					do {
						System.out.println("SELECT  YOUR  Operation\n1. Open Account\n2. Deposit\n3. WithDrawl\n4. Open FD");
						mOperationChoice = mObject.buff.readLine();
						switch(Integer.parseInt(mOperationChoice)) {
						case 1: mObject.mICICI.openAccount(mObject.buff);
								break;
						case 2: mObject.mICICI.deposit(mObject.buff);
								break;
						case 3: mObject.mICICI.withdrawl(mObject.buff);
								break;
						case 4: mObject.mICICI.openFD(mObject.buff);
								break;
						default: System.out.println("No Operation Choice Selected");
						}
						System.out.println("Do you Want to Continue\nYes\nNo");
						ContinueChoice = mObject.buff.readLine();
						if(ContinueChoice.equalsIgnoreCase("No"))
							transaction = false;
					}while(transaction);
					break;
			
			case 2: MyBankClass<HDFC> obj1 = new MyBankClass<HDFC>();
					obj1.create(new HDFC());
					mObject.mHDFC = obj1.getInstance();
					do {
						System.out.println("SELECT  YOUR  Operation\n1. Open Account\n2. Deposit\n3. WithDrawl\n4. Open FD");
						mOperationChoice = mObject.buff.readLine();
						switch(Integer.parseInt(mOperationChoice)) {
						case 1: mObject.mHDFC.openAccount(mObject.buff);
								break;
						case 2: mObject.mHDFC.deposit(mObject.buff);
								break;
						case 3: mObject.mHDFC.withdrawl(mObject.buff);
								break;
						case 4: mObject.mHDFC.openFD(mObject.buff);
								break;
						default: System.out.println("No Operation Choice Selected");
						}
						System.out.println("Do you Want to Continue\nYes\nNo");
						ContinueChoice = mObject.buff.readLine();
						if(ContinueChoice.equalsIgnoreCase("No"))
							transaction = false;
					}while(transaction);
					break;
			
			case 3: MyBankClass<AXIS> obj2 = new MyBankClass<AXIS>();
					obj2.create(new AXIS());
					mObject.mAXIS = obj2.getInstance();
					do {
						System.out.println("SELECT  YOUR  Operation\n1. Open Account\n2. Deposit\n3. WithDrawl\n4. Open FD");
						mOperationChoice = mObject.buff.readLine();
						switch(Integer.parseInt(mOperationChoice)) {
						case 1: mObject.mAXIS.openAccount(mObject.buff);
								break;
						case 2: mObject.mAXIS.deposit(mObject.buff);
								break;
						case 3: mObject.mAXIS.withdrawl(mObject.buff);
								break;
						case 4: mObject.mAXIS.openFD(mObject.buff);
								break;
						default: System.out.println("No Operation Choice Selected");
						}
						System.out.println("Do you Want to Continue\nYes\nNo");
						ContinueChoice = mObject.buff.readLine();
						if(ContinueChoice.equalsIgnoreCase("No"))
							transaction = false;
					}while(transaction);
					break;
			
			default: System.out.println("No Choice of Bank Done");
			}
			
			
		}	
	}
