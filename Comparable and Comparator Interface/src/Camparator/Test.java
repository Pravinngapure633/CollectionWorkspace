package Camparator;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;



public class Test  {
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		Set<Student> set=null;
		
		System.out.println("1:Rollno sort \n2 :Name sort");
		
		int choice =sc.nextInt();
		if(choice == 1)
		{
			set=new TreeSet<Student>(new RollnoSort());
					
		}
		else if(choice == 2)
		{
			set=new TreeSet<Student>(new NameSort());
		}
		
		set.add(new Student(202, "AKSHAY"));
		set.add(new Student(203, "PAWAN"));
		set.add(new Student(201, "VISHAL"));
		set.add(new Student(205, "AKASH"));
	
		for(Student stu: set)
		{
			System.out.println(stu.getRollno()+" "+stu.getName());
		}
		
	}

}
