package Methods;

import java.util.HashMap;
import java.util.Map;

public class size {

public static void main(String[] args) {
		
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(101, "ABC");
		map.put(102, "PQR");
		map.put(103, "XYZ");
		map.put(104, "ABC");
		 System.out.println(map);
		 
		 int i = map.size();
		 System.out.println(i);

}

	
}