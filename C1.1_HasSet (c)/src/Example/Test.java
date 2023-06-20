package Example;

import java.util.HashSet;
import java.util.Set;

public class Test {
	
	public static void main(String[] args) {
		
		Set<Student> s=new HashSet<Student>();
		
		s.add(new Student(101, "ABC"));
		s.add(new Student(102, "PQR"));
		s.add(new Student(101, "ABC"));
		System.out.println(s);
	}
	

}
