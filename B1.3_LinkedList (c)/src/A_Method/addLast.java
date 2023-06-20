package A_Method;

import java.util.LinkedList;

public class addLast {
	
	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		
		System.out.println(l);
		
		l.addLast(10);
		System.out.println(l);
		
}

}
