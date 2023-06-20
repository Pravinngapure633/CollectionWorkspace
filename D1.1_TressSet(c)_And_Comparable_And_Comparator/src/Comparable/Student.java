package Comparable;

public class Student implements Comparable<Student>
{

	private int rollno;
	private String name;
	
	
	public Student(int rollno, String name) 
	{
		super();
		this.rollno = rollno;
		this.name = name;
	}
	
	

	public int getRollno() {
		return rollno;
	}



	public String getName() {
		return name;
	}

	

	@Override
	public int compareTo(Student stu) 
	{
		System.out.println("This rollno="+this.rollno+" "+"Root Element rollno="+stu.rollno);
		
		if(this.rollno>stu.getRollno())
		{
			return +1;
		}
		else if(this.rollno<stu.getRollno())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}



	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	

}
