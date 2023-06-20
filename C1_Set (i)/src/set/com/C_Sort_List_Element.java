package set.com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class C_Sort_List_Element 
{
	public static void main(String[] args) 
	{
		
		List<Integer> list=new ArrayList<Integer>();
	
		list.add(4);
		list.add(3);
		list.add(5);
		list.add(2);
		list.add(1);
		list.add(5);
		
		System.out.println(list); //[4,3,5,2,1,5]
		
		//TreeSet is used for sort element but is it remove duplicate. 
		//hence this method is not used
		Set<Integer> s=new TreeSet<Integer>(list);
		System.out.println(s); //[1,2,3,4,5]
		
		//predefine method for sort . 
		//they will give sort element without removing duplicate element
		Collections.sort(list);
		System.out.println(list); //[1,2,3,4,5,5]
		
	}
}	
