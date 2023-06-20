package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test_Stu 
{
	public static void main(String[] args)
	{
		List al=new ArrayList<Stu>();
		Stu s1=new Stu();
		s1.setRollno(101);
		s1.setName("XYZ");
		
		Stu s2=new Stu();
		s2.setRollno(102);
		s2.setName("PQR");
		
		Stu s3=new Stu();
		s3.setRollno(103);
		s3.setName("ABC");
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);
	}
}
