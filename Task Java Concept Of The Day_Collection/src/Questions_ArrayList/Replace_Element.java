package Questions_ArrayList;

import java.util.ArrayList;

public class Replace_Element {

	public static void main(String[] args) {

		ArrayList<String> l = new ArrayList<String>();

		l.add("JAVA");
		l.add("JSP");
		l.add("JAVA");
		l.add("J2EE");
		l.add("JAVA");
		
		l.set(1, "50");
		
		System.out.println(l);
	}
}
