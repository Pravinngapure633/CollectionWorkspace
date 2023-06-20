package Questions_ArrayList;

import java.util.ArrayList;

public class Convert_To_Array {
	public static void main(String[] args) {
		
ArrayList<String> l=new ArrayList<String>();
		
		l.add("JAVA");
		l.add("JSP");
		l.add("JAVA");
		l.add("J2EE");
		l.add("JAVA");
		
		Object[] array = l.toArray();
		for(Object o: array)
		{
			System.out.println(o);
		}
	}

}
