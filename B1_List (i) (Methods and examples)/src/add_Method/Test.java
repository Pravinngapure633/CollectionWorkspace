package add_Method;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Test {
	 
	public static void main(String[] args) {
		
			List l=new ArrayList();
			l.add(0, 10);
			l.add(1, 30);
			l.add(2, 40);
			l.add(3, 20);
			
			System.out.println(l);
			
			ListIterator li=l.listIterator();
			while(li.hasNext())
			{
				int i=(int)li.next();
				System.out.println(i);
			}
			
			
			
			
	}

}
