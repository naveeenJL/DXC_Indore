package resultmanagment;

import java.io.BufferedReader;

public class Science implements Grading
{
	public void YourResult(BufferedReader buff,StudentDataBase sd)
	{
		try {
				System.out.println("Enter your Name : ");
				String name = buff.readLine();
				
				System.out.println("Enter your Roll : ");
				String roll=buff.readLine();
				
				System.out.println("Enter your class : ");
				String Clas=buff.readLine();
				
				System.out.println("Enter you 1st Subject Name : ");
				String s1n=buff.readLine();
				System.out.println("1st Subject marks : ");
				String sub0=buff.readLine();
				int sub1=Integer.parseInt(sub0);
				
				System.out.println("Enter you 2nd Subject Name : ");
				String s2n=buff.readLine();
				System.out.println("2nd Subject marks : ");
				String subt=buff.readLine();
				int sub2=Integer.parseInt(subt);
				
				System.out.println("Enter you 3rd Subject Name : ");
				String s3n=buff.readLine();
				System.out.println("3rd Subject marks : ");
				String subtr=buff.readLine();
				int sub3=Integer.parseInt(subtr);
				
				System.out.println("Enter you 4th Subject Name : ");
				String s4n=buff.readLine();
				System.out.println("4th Subject marks : ");
				String subf=buff.readLine();
				int sub4=Integer.parseInt(subf);
				
				System.out.println("Enter you 5th Subject Name : ");
				String s5n=buff.readLine();
				System.out.println("5th Subject marks : ");
				String subfi=buff.readLine();
				int sub5=Integer.parseInt(subfi);
				
				int total=((sub1+sub2+sub3+sub4+sub5));
				int avg=total/5;
				
				System.out.println("Congratulations Your Result is Generated !!");
				System.out.println("Your Details are \nName: "+name+"\nRoll: "+roll+
						"\nClass: "+Clas+"\n"+s1n+"Marks : "+
						sub1+"\n"+s2n+"Marks : "+
						sub2+"\n"+s3n+"Marks : "+
						sub3+"\n"+s4n+"Marks : "+
						sub4+"\n"+s5n+"Marks : "+
						sub5);
				System.out.println("Over All Grading : ");
				if(avg>=90)
				{
					System.out.println("A+");
				}
				else if(avg>80 || avg<=90)
				{
					System.out.println("A");
				}
				else if(avg>70 || avg<=80)
				{
					System.out.println("B+");
				}
				else if(avg>60 || avg<=70)
				{
					System.out.println("B");
				}
				else if(avg>50 || avg<=60)
				{
					System.out.println("C+");
				}
				else if(avg>40 || avg<=50)
				{
					System.out.println("C");
				}
				else
				{
					System.out.println("D : Sorry you are not promoted");
				}
				
				sd.setName(name);
				sd.setRoll(roll);
				sd.setClas(Clas);
				sd.setS1n(s1n);
				sd.setSub0(sub0);
				sd.setS2n(s2n);
				sd.setSubt(subtr);
				sd.setS3n(s3n);
				sd.setSubtr(subtr);
				sd.setS4n(s4n);
				sd.setSubf(subfi);
				sd.setSubfi(subfi);
		}
		catch(Exception e) {
			System.out.println("Exception is "+e);
		} 
		
	}
}
