package Ex;

public class Test_Student {
	
	public static void main(String[] args) {
		
		Student s1=new Student(101, "ABC");
		Student s2=new Student(102, "ABC");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		
	}

}
