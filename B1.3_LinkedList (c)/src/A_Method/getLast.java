package A_Method;

import java.util.LinkedList;

public class getLast {

	
	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		
		System.out.println(l);
		
		Object o=l.getLast();
		System.out.println(o);
}
}
