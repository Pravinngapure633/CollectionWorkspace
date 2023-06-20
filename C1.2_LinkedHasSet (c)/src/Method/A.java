package Method;

import java.util.LinkedHashSet;
import java.util.Set;

public class A {
	
	public static void main(String[] args) {
		//isertion order will be preserved
		//duplicate not allowed
		Set s=new LinkedHashSet();
		
		s.add("ABC");
		s.add("PQR");
		s.add("STU");
		s.add("ABC");
		s.add("XYZ");
		s.add(null);
		
		System.out.println(s);
		
	}

}
