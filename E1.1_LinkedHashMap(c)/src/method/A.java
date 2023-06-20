package method;

import java.util.LinkedHashMap;
import java.util.Map;

public class A {

		public static void main(String[] args) {
			
			Map<Integer, String> map=new LinkedHashMap<Integer, String>();
			map.put(101, "java");
			map.put(103, "java");
			map.put(104, "c++");
			map.put(102, "python");
			map.put(105, null);
			map.put(null, "testing");
			map.put(null, "aws");
			
			System.out.println(map);
			
			
			
		}
}
