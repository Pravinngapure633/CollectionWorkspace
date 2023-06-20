package removeAll_Method;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(0, 10);
		l.add(1, 30);
		l.add(2, 40);
		l.add(3, 20);
		System.out.println("List 1:" + l);

		List l1 = new ArrayList();
		l1.add(0, "ABC");
		l1.add(1, 300);
		l1.add(2, 400);
		l1.add(3, 200);
		System.out.println("L2:" + l1);
		
		l.addAll(1, l1);
		System.out.println("List add to index position 1"+l);
		
		l.remove(1);
		System.out.println(l);
		
		l.removeAll(l1);
		System.out.println(l);
		

		
	}
}
