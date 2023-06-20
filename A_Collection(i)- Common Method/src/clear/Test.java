package clear;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Test {
	
public static void main(String[] args) {
		
		Collection a=new ArrayList();
		
		a.add(10);
		a.add(20);
		a.add("ABC");
		a.add(30);
		
		System.out.println(a);
		
		a.clear();
		System.out.println("Clear :"+a);
	}

}
