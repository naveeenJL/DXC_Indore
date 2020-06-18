package JavaIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*public class OutPutStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fio=new FileOutputStream("D:\\nav\\my.file");
		fio.write(100);

	}

}*/

public class OutPutStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fio= new FileInputStream("D:\\nav\\my.file");
		int i=fio.read();
		System.out.println((char) i);
		System.out.println("file read is suscessful");
		
	}
}
