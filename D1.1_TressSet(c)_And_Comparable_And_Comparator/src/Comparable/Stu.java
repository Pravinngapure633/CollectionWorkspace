package Comparable;

public class Stu implements Comparable<Stu>{
	
	private int rollno;
	private String name;
	
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

	@Override
	public String toString() {
		return  "[rollno=" + rollno + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Stu stu) 
	{
		return this.rollno-stu.getRollno();
		//return -(this.rollno-stu.getRollno()); for desending order 
		
		
	}
	
	
	
	

}
