package Methods;

import java.util.Vector;

public class removeAllElements {
	
	public static void main(String[] args) {
		
		 Vector v=new Vector();
		 
		 v.addElement(10);
		 v.addElement(30);
		 v.addElement(40);
		 v.addElement(20);
		 
		 System.out.println(v);
		 
		 v.removeAllElements();
		 System.out.println(v);
	}


}
