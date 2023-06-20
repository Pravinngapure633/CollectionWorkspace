package Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
	
	public static void main(String[] args) {
		
		ArrayList<Student> l=new ArrayList<Student>();
		
		l.add(new Student(105, "PQR", 10));
		l.add(new Student(103, "ABC", 20));
		l.add(new Student(104, "XYZ", 30));
		
		Collections.sort(l);
		for(Student stu:l)
		{
			System.out.println(stu.getRollno()+" "+stu.getStudentname()+" "+stu.getStudentage());
		}
		
	}

}
