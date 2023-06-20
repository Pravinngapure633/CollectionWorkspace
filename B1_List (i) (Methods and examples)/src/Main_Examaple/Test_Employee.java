package Main_Examaple;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Test_Employee {
	
	public void element(List<Employee> list)
	{
	  Iterator<Employee> itr=list.iterator();
	  while(itr.hasNext())
	  {
		  Employee e=itr.next();
		  System.out.println(e.eid);
		  System.out.println(e.ename);
		  System.out.println(e.designation);
		  System.out.println(e.salary);
	  }
	  
	}
	
	
	public static void main (String [] args)
	{
		List<Employee> l=new ArrayList<>();
		
		Employee emp=new Employee(101,"PRAVIN","JAVA",25000);
		Employee emp1=new Employee(102,"VISHAL","JAVA",200);
		
		l.add(emp);
		l.add(emp1);
		
		Test_Employee t=new Test_Employee();
		t.element(l);
		
		
	}

}
