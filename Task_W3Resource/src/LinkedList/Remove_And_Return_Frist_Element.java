package LinkedList;

import java.util.LinkedList;

public class Remove_And_Return_Frist_Element {
	
	
	public static void main(String[] args) {
		  // create an empty linked list
		  LinkedList <String> c1 = new LinkedList <String> ();
		            c1.add("Red");
		          c1.add("Green");
		          c1.add("Black");
		          c1.add("White");
		          c1.add("Pink");
		          System.out.println("Original linked  list: " + c1);
		           
		     System.out.println("Removed element: "+c1.pop());
		     
		     System.out.println("Linked list after pop operation: "+c1);
		  
		     //or
//		     System.out.println(c1.poll());
//		     System.out.println(c1);
	}

}
