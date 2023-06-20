package ListIterator_Method;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class hasNext_next {

	public static void main(String[] args) {

		List l = new ArrayList();
		l.add(10);
		l.add(40);
		l.add(60);
		l.add(30);
		l.add(50);

		System.out.println("List:" + l);

		ListIterator itr = l.listIterator();

		while (itr.hasNext()) 
		{
			int j = (int) itr.next();
			System.out.println(j);
		}
		System.out.println("-----");
		
		//with parameter
		//with index position next print
		ListIterator itr1 = l.listIterator(1);
		while (itr1.hasNext()) 
		{
			int i = (int) itr1.next();
			System.out.println(i);
		}
		
//		System.out.println("=====");
//		//reverse print
//		while (itr.hasPrevious()) 
//		{
//			int i = (int) itr.previous();
//			System.out.println(i);
//		}


	}
}