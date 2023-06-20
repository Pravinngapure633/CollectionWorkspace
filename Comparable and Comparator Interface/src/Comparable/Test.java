package Comparable;

import java.util.Set;
import java.util.TreeSet;

public class Test 
{
	
		public static void main(String[] args) {
			
				Set<Student> set=new TreeSet<Student>();
				
				set.add(new Student(202,"AKSHAY"));
				set.add(new Student(203,"PAWAN"));
				set.add(new Student(201,"VISHAL"));
				set.add(new Student(205,"AKASH"));
				
				System.out.println(set);
				for(Student stu: set)
				{
					System.out.println(stu.getRollno()+ " " +stu.getName());
				}
		}
}
