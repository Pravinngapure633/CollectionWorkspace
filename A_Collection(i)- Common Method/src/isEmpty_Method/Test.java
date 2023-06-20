package isEmpty_Method;

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
			
			
			System.out.println(a.isEmpty());
			
			a.clear();
			System.out.println(a.isEmpty());
			
			
		}

}
