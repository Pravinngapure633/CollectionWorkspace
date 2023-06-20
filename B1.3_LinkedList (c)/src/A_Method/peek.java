package A_Method;

import java.util.LinkedList;

public class peek {

	
public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		
		System.out.println(l);
		
		Object o=l.peek();
		System.out.println(o);
		System.out.println(l);
		
		Object o1=l.peekFirst();
		System.out.println(o1);
		System.out.println(l);
		
		Object o2=l.peekLast();
		System.out.println(o2);
}
}
