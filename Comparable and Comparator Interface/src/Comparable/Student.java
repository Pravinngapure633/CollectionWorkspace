package Comparable;

public class Student implements Comparable<Student> {
	
	private int rollno;
	private String name;
	
	@Override
	public int compareTo(Student stu) {
		
		return this.getRollno()-stu.getRollno();
	}
	
	
	public Student(int rollno, String name) 
	{
		super();
		this.rollno = rollno;
		this.name = name;
	}
	
	public int getRollno()
	{
		return rollno;
	}
	public void setRollno(int rollno)
	{
		this.rollno = rollno;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}



	

	
	
	
	

}
