package Ex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test1 {
	
	public static void main(String[] args) {
	
		List<Integer> al1=new ArrayList<Integer>();
		al1.add(10);
		al1.add(30);
		al1.add(20);
		al1.add(40);
		
		List<Integer> al2=new ArrayList<Integer>();
		al2.add(50);
		al2.add(70);
		al2.add(60);
		al2.add(80);
		
		Map<String , List<Integer>> m=new HashMap<String, List<Integer>>();
		m.put("List2", al2);
		m.put("List1", al1);
		
		System.out.println(m);
		
		Set<String> keys = m.keySet();
		Iterator<String> itr = keys.iterator();
		while(itr.hasNext())
		{
			String s=itr.next();
			List<Integer> list = m.get(s);
			System.out.println(s);
			for(Integer i:list)
			{
				System.out.println(i);
			}
		}

	}
	
	
}
