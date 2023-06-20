package B_Methods_For_getting_Element;

import java.util.ArrayList;
import java.util.List;

public class C_ForEach_by_lambda_way {
	
	
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(5);
		list.add(10);
		list.add(5);
		list.add(7);
		
		System.out.println(list);
		
		
		//forEach--- by lambda expression
		list.forEach((x)-> System.out.println(x));
	}

}
