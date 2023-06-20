package Iterator_method;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test {

		public static void main(String[] args) {
			
			Collection a=new ArrayList();
			
			a.add(10);
			a.add(20);
			a.add("ABC");
			a.add(30);
			
		Iterator itr=a.iterator();
			
		while(itr.hasNext())
		{
			Object o=itr.next();
			
			if(o instanceof Integer)
			{
				int i=(int)o;
				System.out.println(i);
			}
			else if(o instanceof String)
			{
				String s=(String)o;
				System.out.println(s);
			}
		
		}
			
		}
	
}
