package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Student> l=new ArrayList<Student>();
		
		l.add(new Student(101, "XXX"));
		l.add(new Student(105, "BBB"));
		l.add(new Student(103, "AAA"));
	
	
	
	Collections.sort(l);
		for(Student s:l)
		{
			System.out.println(s.getRoll()+s.getName());
		}
		
		
		
	}

}
