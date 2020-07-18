package threads;

public class Multithreading implements Runnable{

	public static void main(String[] args) {
		
		Thread t1=new Thread();
		Thread t2= new Thread();
		
		t1.start();
		t2.start();
		
		System.out.println("name of first thread is :"+t1.getName()+"\n name of second thread:" +t2.getName());
		

}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("running sucessfuly" );
	}
}
