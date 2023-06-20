package remove_Method;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Test_1 {

public static void main(String[] args) {
		
		Collection a=new ArrayList();
		
		a.add(10);
		a.add(20);
		a.add("ABC");
		a.add(30);
//		a.add(80);
//		a.add("XYZ");
		
		System.out.println("List : "+a);
		
		a.remove(10);
		System.out.println("Remove with element : "+a);
		
		a.remove("ABC");
		System.out.println("Remove with string : "+a);
		
	}
}
