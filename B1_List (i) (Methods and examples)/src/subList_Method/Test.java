package subList_Method;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		
		List l = new ArrayList();
		l.add(10);
		l.add(40);
		l.add("ABC");
		l.add(30);
		l.add(50);
		
		List l1=l.subList(1, 5);
		System.out.println(l1);
	}

}
