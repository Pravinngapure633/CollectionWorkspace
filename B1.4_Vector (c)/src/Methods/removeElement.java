package Methods;

import java.util.Vector;

public class removeElement {

	public static void main(String[] args) {
		
		 Vector v=new Vector();
		 
		 v.addElement(10);
		 v.addElement(30);
		 v.addElement(40);
		 v.addElement(20);
		 
		 System.out.println(v);
		 
		 v.removeElement(10);
		 System.out.println(v);
		 
		 boolean b=v.removeElement(20);
		 System.out.println(b);
		 System.out.println(v);
	}

}
