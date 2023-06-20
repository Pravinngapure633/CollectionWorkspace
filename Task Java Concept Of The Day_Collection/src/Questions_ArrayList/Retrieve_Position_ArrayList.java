package Questions_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class Retrieve_Position_ArrayList {
	
	public static void main(String[] args) {
		

		ArrayList<Integer> l=new ArrayList<Integer>();
		
		l.add(101);
		l.add(202);
		l.add(302);
		l.add(404);
		l.add(505);
		
		System.out.println(l);
		
		List<Integer> subList = l.subList(2, 4);
		System.out.println(subList);
		
		
	}

}
