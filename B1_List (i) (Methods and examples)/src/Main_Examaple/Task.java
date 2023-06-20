package Main_Examaple;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task {
	
	public static void main(String[] args) {
		
		List<String> l=new ArrayList();
		
		l.add("ABC");
		l.add("PQR");
		l.add("XYZ");
		l.add("LMN");
		l.add("UVW");
		
		System.out.println("=========by using iterator======");
		Iterator<String> itr=l.iterator();
		
		while (itr.hasNext())
		{
			String s = itr.next();
			System.out.println(s);
		}
		
		System.out.println("==========by using inhance for loop========");
		
		for (String s : l) 
		{
			System.out.println(s);
		}
		
		
		System.out.println("==========by using Simple for loop========");
		System.out.println("1st:-");
		 
		for (Iterator itr1 = l.iterator(); itr1.hasNext();) {
			String s = (String) itr1.next();
			System.out.println(s);
		}
		System.out.println();
		System.out.println("2nd:-");
		
		for(int i=0; i<l.size();i++)
		{
			String s = l.get(i);
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println("3rd:-");
		
		
		Object[] s =  l.toArray();
		for(int i=0; i<s.length; i++)
		{
			System.out.println(s[i]);
		}
		
//		float [] x={10.25f,20.65f};
//		int[] z=(int [])x;
//		System.out.println(z);
	}
	

}
