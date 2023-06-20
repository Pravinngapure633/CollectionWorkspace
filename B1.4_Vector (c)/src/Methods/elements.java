package Methods;

import java.util.Enumeration;
import java.util.Vector;

public class elements {

	public static void main(String[] args) {
		
		 Vector v=new Vector();
		 
		 v.addElement(10);
		 v.addElement(30);
		 v.addElement(40);
		 v.addElement(20);
		 
		 System.out.println(v);
		 
		 
		 Enumeration e = v.elements();
		 while(e.hasMoreElements())
		 {
			 Object o=e.nextElement();
			 System.out.println(o);
		 }
	}

}
