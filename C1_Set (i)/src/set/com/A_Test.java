package set.com;

import java.util.HashSet;
import java.util.Set;

public class A_Test {
	
	public static void main(String[] args) {
		
		Set<String> s=new HashSet<String>();
		
		s.add("aaa");
		s.add("bbb");
		s.add("ccc");
		s.add("bbb");
		// set does not allow set element
		System.out.println(s);
		
		s.forEach(System.out::println);
		
	}

}
