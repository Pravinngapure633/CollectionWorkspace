package Methods;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class values {
	
public static void main(String[] args) {
		
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(101, "ABC");
		map.put(102, "PQR");
		map.put(103, "XYZ");
		map.put(104, "ABC");
		 System.out.println(map);
		 
		 Collection c=map.values();
		 System.out.println(c);
		 
	}


}
