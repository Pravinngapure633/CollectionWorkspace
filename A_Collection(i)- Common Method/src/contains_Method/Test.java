package contains_Method;

import java.util.ArrayList;
import java.util.Collection;

public class Test {

			public static void main(String[] args) {
				
					Collection a=new ArrayList();
					
					a.add(10);
					a.add(20);
					a.add("ABC");
					a.add(30);
					
					System.out.println("List :"+a);
					
					
					System.out.println(a.contains("ABC"));
					
					System.out.println(a.contains(50));
			}
}
