package A_Method;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class decendingIterator {
	
	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		
		System.out.println(l);
		
		Iterator itr=l.descendingIterator();
		while(itr.hasNext())
		{
			Object o=itr.next();
			System.out.println(o);
		}
		
	
		
		
	
		
	}

}
