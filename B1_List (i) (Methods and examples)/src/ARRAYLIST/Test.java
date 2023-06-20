package ARRAYLIST;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		
		List a1=new ArrayList();
		
		//Add element
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add("ABC");
		a1.add("PQR");
		a1.add(10);
		
		System.out.println(a1);
		//  or System.out.println(a1.toString());
		
		//get element
		int i=(int) a1.get(1);
		System.out.println(i);
		
		//System.out.println(a1.get(0));
		
		String s=(String)a1.get(3);
		System.out.println(s);
	}

}
