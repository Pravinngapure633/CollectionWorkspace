package program;

import java.util.SortedSet;
import java.util.TreeSet;

public class Test {
	
	public static void main(String[] args) {
		
		SortedSet s=new TreeSet();
		
		s.add(10);
		s.add(30);
		s.add(40);
		s.add(20);
		s.add(50);
		System.out.println(s);
		
//		s.add(null);
//		System.out.println(s);  null pointer exception
		
//		s.add("ABC");
//		System.out.println(s); //class cast exception
		
//		System.out.println(s.first());
//		
//		System.out.println(s.last());
		
//		System.out.println(s.subSet(10, 40));
		
		System.out.println(s.headSet(40));
		
		System.out.println(s.tailSet(20));
		
		
	}

}
