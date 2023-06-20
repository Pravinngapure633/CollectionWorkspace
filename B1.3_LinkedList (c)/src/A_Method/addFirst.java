package A_Method;

import java.util.LinkedList;

public class addFirst {
	
	public static void main(String[] args) {
		
			LinkedList l=new LinkedList();
			l.add(10);
			l.add(30);
			l.add(20);
			
			System.out.println(l);
			
			l.addFirst(20);
			System.out.println(l);
	}

}
