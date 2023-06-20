package remove_Method;

import java.util.ArrayList;

import java.util.List;

public class Test {
	
public static void main(String[] args) {
		
		List a=new ArrayList();
		
		a.add(10);
		a.add(20);
		a.add("ABC");
		a.add(30);
//		a.add(80);
//		a.add("XYZ");
		
		System.out.println("List : "+a);
		
		a.remove(1);
		System.out.println("Remove with index postion : "+a);
		
		a.remove(new Integer(30));//rapper class
		System.out.println("Remove with value : "+a);
		
		a.remove("ABC");
		System.out.println("Remove with string : "+a);
		
	}

}
