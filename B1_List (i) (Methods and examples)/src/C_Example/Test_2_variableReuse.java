package C_Example;

import java.util.ArrayList;
import java.util.List;

public class Test_2_variableReuse {

	public static void main(String[] args) {
		
		List<Student> list=new ArrayList<Student>();
		Student stu = new Student(101,"ABC");
		list.add(stu);
		stu=new Student(102,"PQR");
		list.add(stu);
		
		for(Student s: list)
		{
			System.out.println(s.getRollno());	//with out toString method
			System.out.println(s.getName());
			//System.out.println(s);
		}
	}
}
