package Method;

import java.util.HashSet;
import java.util.Set;

public class add {

	public static void main(String[] args) {
		//insertion order not preserve
			Set	s=new HashSet();
			s.add(10);
			s.add(30);
			s.add(50);
			s.add(70);
			s.add(10);
			s.add(40);
			s.add(20);
			s.add(null);
			
			System.out.println(s);//null ,50,20,70,40,10,30
			
			boolean b=s.contains(30);
			System.out.println(b);
	}
}
