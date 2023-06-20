package ListIterator_Method;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class A {
	
	public static void main(String[] args) {
		
		List l = new ArrayList();
		l.add(10);
		l.add(40);
		l.add(60);
//		l.add(30);
//		l.add(50);

		System.out.println("List:" + l);

		ListIterator itr = l.listIterator();

		while (itr.hasNext()) 
		{
			int j = (int) itr.next();
			System.out.println(j);
			
			while (itr.hasNext())
			{
				int i = itr.nextIndex();
				System.out.println(i);
				itr.next();
			}
		}
	}

}
