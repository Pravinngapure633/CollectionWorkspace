package B_Methods_For_getting_Element;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A_Iterator_Way {

	public static void main(String[] args) {
		
		List<Integer> list= new ArrayList<>();
	
		list.add(5);
		list.add(10);
		list.add(5);
		list.add(7);
		
		System.out.println(list);
		
		
		// for getting element syntax
		// iterator is interface
		Iterator<Integer> itr= list.iterator();
		
			while(itr.hasNext())
			{
				int x=itr.next();
				System.out.println(x);
			}
		
	}	
}
