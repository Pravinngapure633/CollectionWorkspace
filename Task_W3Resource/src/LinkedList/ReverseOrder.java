package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseOrder {
	
	public static void main(String[] args) {
		
		LinkedList<String> l_list = new LinkedList<String>();
		   // use add() method to add values in the linked list
		          l_list.add("Red");
		          l_list.add("Green");
		          l_list.add("Black");
		          l_list.add("Pink");
		          l_list.add("orange");
		      
		        // print original list
		   System.out.println("Original linked list:" + l_list);  
		  
		   Iterator<String> itr = l_list.descendingIterator();
		   
		   while(itr.hasNext())
		   {
			   String s = itr.next();
			   System.out.println(s);
		   }
		 
	}

}
