package removeAll_Method;

import java.util.ArrayList;
import java.util.Collection;

public class Test {

	public static void main(String[] args) {
	
		Collection a=new ArrayList();
		
		a.add(10);
		a.add(20);
		a.add("ABC");
		a.add(30);
		
		System.out.println("List 1 : "+a);
		
		Collection a1=new ArrayList();
		
		a1.add(55);
		a1.add(88);
		a1.add("XYZ");
		a1.add(33);
		
		System.out.println("List 2 : "+a1);
		
		a.addAll(a1);
		System.out.println("List Add : "+a);
		
		
		a.removeAll(a1);
		System.out.println("Remove List : "+a);
		
		 
		
		
	}
}
