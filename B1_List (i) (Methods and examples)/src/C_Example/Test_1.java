package C_Example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test_1 {
	
	public static void main(String[] args) {
		
		Student stu=new Student(101,"ABC");
		
		Student stu1=new Student(101,"ABC");
		
		List<Student> list=new ArrayList<Student>();
		
		list.add(stu);
		list.add(stu1);
		
		Iterator<Student> itr=list.iterator();
		
		while(itr.hasNext())
		{
			Student s=itr.next();
			System.out.println(s);
		}
		
		
	}

}
