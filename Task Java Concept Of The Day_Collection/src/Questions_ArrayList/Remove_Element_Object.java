package Questions_ArrayList;

import java.util.ArrayList;

public class Remove_Element_Object {
	
public static void main(String[] args) {
	
	ArrayList<String> l=new ArrayList<String>();
	
	l.add("JAVA");
	l.add("JSP");
	l.add("JAVA");
	l.add("J2EE");
	l.add("JAVA");
	
	l.remove("JAVA");
	System.out.println(l);
}

}
