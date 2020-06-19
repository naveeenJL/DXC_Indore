package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class linked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> li=new LinkedList<String>();
		
		li.add("nav");
		li.add("een");
		li.add("jl");
		
		Iterator itr=li.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next());
		}
				
	}

}
