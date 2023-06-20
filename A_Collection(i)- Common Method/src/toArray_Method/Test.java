package toArray_Method;

import java.util.ArrayList;
import java.util.Collection;

public class Test {

		public static void main(String[] args) {
			
				Collection c=new ArrayList();
				c.add(10);
				c.add(30);
				c.add("ABC");
				c.add(20);
				
				System.out.println("list 1: "+c);
				
				Collection c1=new ArrayList();
				c.add(100);
				c.add(300);
				c.add("ABCCC");
				c.add(200);
				
				c.addAll(c1);
				
			Object o=	c.toArray();
				System.out.println(o);
		}
}
