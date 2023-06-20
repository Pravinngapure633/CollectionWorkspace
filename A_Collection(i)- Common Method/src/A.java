import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class A {
	
	
	public static void main(String[] args) {
		
			Collection a=new ArrayList();
			a.add(10);
			a.add(20);
			a.add(30);
			a.add(40);
			
			System.out.println("List"+a);
			
			Collection a1=new ArrayList();
			a1.add(100);
			a1.add(200);
			a1.add(300);
			a1.add(400);
			
			System.out.println("List2"+a1);
			
//			a.clear();
//			System.out.println(a);
			//int x=a.size();
			//System.out.println(x);
			
//			boolean b=a.contains(60);
//			System.out.println(b);
			
//		boolean b=a.containsAll(a1);
//			System.out.println(b);
			
//			a.toArray();
//			System.out.println("TO Array"+a);
//			a.clear();
//			boolean b=a.isEmpty();
//			
//			System.out.println(b);
			a.addAll(a1);
//			a.retainAll(a1);
//			System.out.println(a);
			
//			Iterator itr=a.iterator();
//			while(itr.hasNext())
//			{
//				int o=(int)itr.next();
//				System.out.println(o);
//			}
			
//			for(Object o:a)
//			{
//				System.out.println(o);
//			}
			
//			for(Iterator itr=a.iterator(); itr.hasNext();)
//			{
//				Object o=itr.next();
//				System.out.println(o);
//			}
			Object[] o=a.toArray();
			for(int i=0;i<o.length;i++)
			{
			System.out.println(o[i]);
			}
			
	}

}
