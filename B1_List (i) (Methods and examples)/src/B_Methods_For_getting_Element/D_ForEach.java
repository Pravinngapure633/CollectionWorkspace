package B_Methods_For_getting_Element;

import java.util.ArrayList;
import java.util.List;

public class D_ForEach {

	public static void main(String[] args) {
		
		List<Integer> list= new ArrayList<Integer>();
		
		list.add(5);
		list.add(10);
		list.add(5);
		list.add(7);
		
		System.out.println(list);
		
		//for each loop
		list.forEach(System.out::println);
	}
}
