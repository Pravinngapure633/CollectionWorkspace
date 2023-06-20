package Main_Examaple;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test_Employee_1 {

	public List<Employee_1> m1(List<Employee_1> l2)
	{
		Iterator<Employee_1> itr=l2.iterator();
		while(itr.hasNext())
		{
			Employee_1 q=itr.next();
			System.out.println(q.getEid());
			System.out.println(q.getEname());
			System.out.println(q.getSalary());
		}
				
		return l2;
		
	}
	
	public static void main(String[] args) {
		
		List<Employee_1> l1=new ArrayList<Employee_1>();
		
		Employee_1 emp=new Employee_1(101,"Pravin",5000);
		Employee_1 emp1=new Employee_1(102,"Vishal",2000);
		
		l1.add(emp);
		l1.add(emp1);
		
		Test_Employee_1 t=new Test_Employee_1();
		t.m1(l1);
	}
}
