package Methods;

import java.util.HashMap;
import java.util.Map;

public class remove2 {
public static void main(String[] args) {
		
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(101, "ABC");
		map.put(102, "PQR");
		map.put(103, "XYZ");
		map.put(104, "ABC");
		 System.out.println(map);
		 
		 boolean s = map.remove(102, "PQR");
		 System.out.println(s);
		 System.out.println(map);
	}


}
