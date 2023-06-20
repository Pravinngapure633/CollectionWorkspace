package comparator;

import java.util.Comparator;

public class EidSort implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) 
	{
		if(emp1.getEid()>emp2.getEid())
		{
			return 1;
		}
		else if(emp1.getEid()<emp2.getEid())
		{
			return -1;
		}
		else {
			return 0;
		}
		
	}

}
