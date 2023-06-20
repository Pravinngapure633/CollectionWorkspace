package set_Method;

import java.util.ArrayList;
import java.util.List;

public class Test {

		public static void main(String[] args) {
			
			List l=new ArrayList();
			l.add(0, 10);
			l.add(1, 30);
			l.add(2, 40);
			l.add(3, 20);
			
			System.out.println("List 1:"+l);
			
			//replace value and add new value with same index position
			l.set(1, 300);
			System.out.println(l);
			
			l.set(2, "ABC");
			System.out.println(l);
		}
}
