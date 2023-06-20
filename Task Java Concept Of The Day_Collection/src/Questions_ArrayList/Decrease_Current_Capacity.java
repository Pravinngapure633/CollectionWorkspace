package Questions_ArrayList;

import java.util.ArrayList;

public class Decrease_Current_Capacity {
	
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.ensureCapacity(20);
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		
		list.trimToSize();
		System.out.println(list.size());
		
		
		
	}
	
	


}
