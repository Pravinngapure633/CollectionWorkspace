package Example;

import java.util.Objects;

public class Student {
	
	private int rollno;
	private String name;
	
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(name, rollno);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && rollno == other.rollno;
	}


	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}


	public int getRollno() {
		return rollno;
	}


	public String getName() {
		return name;
	}


	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	
	

}
