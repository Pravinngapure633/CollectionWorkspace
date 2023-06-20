package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test_Employee {
	
	public static void main(String[] args) {
		
		List<Employee> al=new ArrayList<Employee>();
		al.add(new Employee(101,"XYZ"));
		al.add(new Employee(103,"PQR"));
		al.add(new Employee(102,"ABC"));
		
		System.out.println(al);
		
		Collections.sort(al, new EidSort());
		System.out.println(al);
		
		Collections.sort(al, new EnameSort());
		System.out.println(al);
		
	}

}
	