package Main_Examaple;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
	
	public void show(List<Student> l1)
	{
		//by using getter
		Student stu=l1.get(2);
		System.out.println(stu.getRollno());
		System.out.println(stu.getName());
		System.out.println(stu.getAddress());
		
		System.out.println("===========By using iterator=======");
		
		Iterator<Student> itr = l1.iterator();
		while (itr.hasNext()) 
		{
			System.out.println("****Studdent Information*****");
			Student stu1 = (Student) itr.next();
			System.out.println(stu1.getRollno());
			System.out.println(stu1.getName());
			System.out.println(stu1.getAddress());
			
		}
		
		System.out.println("===========By using inhance for loop=======");
		
		for (Student stu1 : l1) 
		{
			System.out.println("****Studdent Information*****");
			System.out.println(stu1.getRollno());
			System.out.println(stu1.getName());
			System.out.println(stu1.getAddress());
		}
		
//		System.out.println("XXXXXXX by using lambda expression  XXXXXXXX");
//		l1.forEach((s)->
//				{
//					Student stu1=l1.get(0);
//					System.out.println(stu1.getName());
//					System.out.println(stu.getRollno());
//				});
		
		
	}

	
	public static void main(String[] args) {
		
		List<Student> al=new ArrayList();
		
		al.add(new Student(101,"PRAVIN","NAGPUR"));
		al.add(new Student(102,"VISHAL","PUNE"));
		al.add(new Student(103,"SAURABH","BHANDARA"));
		
		//address
		System.out.println(al);
		
		Test  t=new Test();
		 t.show(al);
		
	}
}
