package containsAll_Method;

import java.util.*;

public class A 
{
    public static void main(String[] args)
    {
		 List l1=new ArrayList();
		 
		 List l2=new ArrayList();
		 l2.add(20);
		 l1.addAll(l2);
		 
		 l1.removeAll(l2);
		 
		boolean b= l1.containsAll(l2);
		 
		
		
		System.out.println(b);
		 
		 
		 
	}
}
