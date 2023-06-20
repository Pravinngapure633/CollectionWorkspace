package ListIterator_Method;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class hasPrevious_previous {
	
	public static void main(String[] args) {

		List l = new ArrayList();
		l.add(10);
		l.add(40);
		l.add("ABC");
		l.add(30);
		l.add(50);

		ListIterator itr = l.listIterator(5);
		//reverse print
		while(itr.hasPrevious())
		{
			Object o=itr.previous();
			System.out.println("Previous:"+o);
		}
		

		
	}
}