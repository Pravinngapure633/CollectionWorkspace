package Questions_ArrayList;

import java.util.ArrayList;

public class Element_Is_Present_Or_Not {
	
	public static void main(String[] args) {
		
		ArrayList<Double> l=new ArrayList<Double>();
		
		l.add(1.1);
		l.add(2.1);
		l.add(3.1);
		l.add(4.1);
		l.add(5.1);
		
		System.out.println(l.contains(2.1));
		
	}

}
