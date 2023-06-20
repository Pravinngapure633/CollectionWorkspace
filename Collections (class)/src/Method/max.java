package Method;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class max {
	
	public static void main(String[] args) {
		
		List<Integer> l=new ArrayList<Integer>();
		
		l.add(70);
		l.add(50);
		l.add(40);
		l.add(60);
		l.add(10);
		l.add(30);
		l.add(20);
		
		System.out.println(l);
		
		int i=Collections.max(l);
		System.out.println(i);
		 
	}
}
