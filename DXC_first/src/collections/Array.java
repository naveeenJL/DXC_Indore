package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> li= new ArrayList<Integer>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(1);
		
		Iterator itr=li.iterator();
		while( itr.hasNext()) {
			System.out.println(itr.next());
		}
	
		
		
	}

}
