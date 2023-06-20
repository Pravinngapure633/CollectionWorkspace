package size;

import java.util.ArrayList;
import java.util.Collection;

public class Test {
	
	public static void main(String[] args) {
		
		Collection a=new ArrayList();
		
		a.add(10);
		a.add(20);
		a.add("ABC");
		a.add(30);
		
		System.out.println("List : "+a);
	
		int i=a.size();
		System.out.println("Size : "+i);
	}

}
