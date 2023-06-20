package Methods;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class KeySet_Iterator {
	
	
public static void main(String[] args) {
		
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(101, "ABC");
		map.put(102, "PQR");
		map.put(103, "XYZ");
		map.put(104, "ABC");
		 System.out.println(map);
		 
		 //1st
		 Set<Integer> keys=map.keySet();
		 for(Integer key :keys)
		 {
			 String value= map.get(key);
			 System.out.println("Key :"+key+" "+"Value :"+value);
		 }
		 
		
	
		 
}
}
