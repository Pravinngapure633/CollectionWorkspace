package addAll_Method;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List l=new ArrayList();
		l.add(0, 10);
		l.add(1, 30);
		l.add(2, 40);
		l.add(3, 20);
		
		System.out.println("List 1: " +l);
		
		List l1=new ArrayList();
		l1.add(0, "ABC");
		l1.add(1, "PQR");
		l1.add(2, "XYZ");
		l1.add(3, "LMN");
		
		System.out.println("List 2 :"+l1);
		
		l.addAll(l1);
		System.out.println("List add directly"+l);
		
		 l.addAll(1, l1);
		System.out.println("List add in list 1 with index position 1 :"+l);
		
		
}
}

