package Comparator;

import java.util.Comparator;

public class Student  {
	
	private int roll;
	private String name;
	
	
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static Comparator<Student> Roll=new Comparator<Student>() 
	{

		@Override
		public int compare(Student s1, Student s2)
		
		{
			
			return s1.getRoll()-s2.getRoll();
		}
			
	};
	public static Comparator<Student> x=new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			
			return o1.getRoll()-o2.getRoll();
		}
	};
	
	

}
