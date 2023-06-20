package Main_Examaple;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test_1 {
	
	public List<Student1> setInfo()
	{
		List<Student1> al=new ArrayList();
		
		Student1 stu1=new Student1();
		stu1.setRollno(101);
		stu1.setName("PRAVIN");
		stu1.setAddress("PUNE");
		
		Student1 stu2=new Student1();
		stu2.setRollno(101);
		stu2.setName("SAURABH");
		stu2.setAddress("NAGPUR");
		
		Student1 stu3=new Student1();
		stu3.setRollno(101);
		stu3.setName("VISHAL");
		stu3.setAddress("XYZ");
		
		al.add(stu1);
		al.add(stu2);
		al.add(stu3);
		
		return al;
	}
	
	public static void main(String[] args) {
		
			Test_1 t=new Test_1();
		
			List<Student1> l=t.setInfo();
			
			Iterator<Student1> itr=l.iterator();
			
			while(itr.hasNext())
			{
				Student1 stu=itr.next();
				System.out.println(stu.getRollno());
				System.out.println(stu.getName());
				System.out.println(stu.getAddress());
			}
			
			
			
			
			
	}

}
