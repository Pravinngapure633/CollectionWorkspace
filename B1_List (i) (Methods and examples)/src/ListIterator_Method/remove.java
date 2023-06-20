package ListIterator_Method;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class remove {
	
	public static void main(String[] args) {

		List l = new ArrayList();
		l.add(10);
		l.add(40);
		l.add("ABC");
		l.add(30);
		l.add(50);

		
		ListIterator itr = l.listIterator();
		
		while(itr.hasNext())
		{
			Object o=itr.next();
			if(o.equals("ABC"))
			{
			itr.remove();
			
			}
		}
		System.out.println(l);
	

		
	}

}
