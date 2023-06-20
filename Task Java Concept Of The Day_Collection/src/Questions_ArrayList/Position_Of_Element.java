package Questions_ArrayList;

import java.util.ArrayList;

public class Position_Of_Element {
	
	public static void main(String[] args) {
		
		ArrayList<String> l=new ArrayList<String>();
		
		l.add("JAVA");
		l.add("JSP");
		l.add("JAVA");
		l.add("J2EE");
		l.add("JAVA");
		
		System.out.println(l.indexOf("JAVA"));
		
		System.out.println(l.lastIndexOf("JAVA"));
		
	}

}
