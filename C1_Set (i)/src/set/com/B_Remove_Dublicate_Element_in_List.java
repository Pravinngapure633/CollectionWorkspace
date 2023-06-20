package set.com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class B_Remove_Dublicate_Element_in_List {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(5);
		list.add(3);
		list.add(5);
		list.add(10);
		list.add(30);
		
		System.out.println(list); //[5,3,5,10,30]
		
		//this is used for duplicate element remove but order will change . hence this method is not use
		Set<Integer> s=new HashSet<Integer>(list);  
		System.out.println(s);//[3,5,10,30]   -order will get change
		
		System.out.println("-----");
		
		//LinkedHashSet is used. 
		//this is remove duplicate element and order will not change 
		Set<Integer> s1=new LinkedHashSet<Integer>(list);
		System.out.println(s1); //[5,3,10,30]
		
		
	}
}
