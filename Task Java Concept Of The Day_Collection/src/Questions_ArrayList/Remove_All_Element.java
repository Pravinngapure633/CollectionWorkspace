package Questions_ArrayList;

import java.util.ArrayList;

public class Remove_All_Element {

	public static void main(String[] args) {

		ArrayList<String> l = new ArrayList<String>();

		l.add("JAVA");
		l.add("JSP");
		l.add("JAVA");
		l.add("J2EE");
		l.add("JAVA");
		
		l.clear();
		System.out.println(l);
	}
}
