package comparator;

import java.util.TreeSet;

public class Test_int {
	
	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet<>(new intComparator());
		
		t.add(10);
		t.add(40);
		t.add(30);
		t.add(20);
		
		System.out.println(t);
		
		
	}

}
