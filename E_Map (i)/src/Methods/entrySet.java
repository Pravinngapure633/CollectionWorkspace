package Methods;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class entrySet {
	
	public static void main(String[] args) {
		
	Map<Integer, String> map=new HashMap<Integer, String>();
	map.put(101, "ABC");
	map.put(102, "PQR");
	map.put(103, "XYZ");
	map.put(104, "ABC");
	
	//System.out.println(map);
	
	 Set<Entry<Integer,String>> s= map.entrySet();
	System.out.println(s);
	System.out.println("===");
	 
	 for (Entry<Integer, String> e : s) 
	 {
		 System.out.println(e.getKey()+"  "+e.getValue());
		
		 
		 if(e.getKey()==101)
		 {
			 e.setValue("PRAVIn");
		 }
	}
	 System.out.println(map);
	}
}
