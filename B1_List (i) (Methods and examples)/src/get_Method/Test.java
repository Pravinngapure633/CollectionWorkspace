package get_Method;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List l=new ArrayList();
		l.add(0, 10);
		l.add(1, 30);
		l.add(2, 40);
		l.add(3, 20);
		
		System.out.println("List :"+l);
		
		Object o=l.get(3);
		System.out.println(o);
		
		int i=(int)l.get(3);
		System.out.println(i);
		
	}
		
}
