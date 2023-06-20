package Methods;

import java.util.HashMap;
import java.util.Map;

public class replace_1 {
	
	
public static void main(String[] args) {
		
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(101, "ABC");
		map.put(102, "PQR");
		map.put(103, "XYZ");
		map.put(104, "ABC");
		 System.out.println(map);
	
		 boolean b = map.replace(101, "ABC", "Vishal");
		 System.out.println(b);
		 System.out.println(map);
		 
}


}
