package C_Example;

import java.util.ArrayList;
import java.util.List;

public class List_of_List {
	
	public static void main(String[] args) {
		
		List<String> mh=new ArrayList<String>();
		
		mh.add("pune");
		mh.add("Mumbai");
		mh.add("Nagpur");
		
		List<String> jh=new ArrayList<String>();
		
		jh.add("Ranchi");
		jh.add("Lohandaga");
		jh.add("gumla");
		
		List<List<String>> india=new ArrayList<List<String>>();
		
		india.add(mh);
		india.add(jh);
		
		india.forEach((sname)->sname.forEach(System.out::println));
	}

}
