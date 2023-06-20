package Comparable;

import java.util.TreeSet;

public class TressSetDemmo_Student 
{

	public static void main(String[] args) {
		
		TreeSet t=new TreeSet<>();
		t.add(new Student(101,"XYZ"));
		t.add(new Student(103,"PQR"));
		t.add(new Student(102,"ABC"));
		
		System.out.println(t);
	}
}
