package Methods;

import java.util.HashMap;
import java.util.Map;

public class clear_isEmpty {

public static void main(String[] args) {
		
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(101, "ABC");
		map.put(102, "PQR");
		map.put(103, "XYZ");
		map.put(104, "ABC");
		 System.out.println(map);

		 map.clear();
		 boolean b = map.isEmpty();
		 System.out.println(b);
}

}
