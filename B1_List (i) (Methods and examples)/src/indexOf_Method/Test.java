package indexOf_Method;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		
		List l=new ArrayList();
		l.add(0, 10);
		l.add(1, 30);
		l.add(2, "PQR");
		l.add(3, 20);
		l.add(4, 30);
		
		System.out.println("List :"+l);
		//to find index position
		int i=(int)l.indexOf("PQR");
		System.out.println(i);
	}

}
