package A_Method;

import java.util.LinkedList;

public class getFirst {

	
public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		
		System.out.println(l);
		
		System.out.println(l.getFirst());
		System.out.println(l);
}
}