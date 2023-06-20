package List_Of_List_Adding;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class World_By_Using_itr_forLoop_ForEach {

	public static void main(String[] args) {

		List<String> mh = new ArrayList<String>();
		mh.add("Pune");
		mh.add("NAgpur");
		mh.add("Kolhapur");

		List<String> goa = new ArrayList<String>();
		goa.add("Panjim");
		goa.add("Vasco");
		goa.add("Madgao");

		List<List<String>> india = new ArrayList<List<String>>();

		india.add(mh);
		india.add(goa);

		System.out.println("INDIA" + india);

		System.out.println("============");

		List<String> newyork = new ArrayList<String>();

		newyork.add("Elmira");
		newyork.add("Hornell");
		newyork.add("Kingstone");

		List<String> losangeles = new ArrayList<String>();

		losangeles.add("Bell");
		losangeles.add("Hiden Hills");
		losangeles.add("Lake Wood");

		List<List<String>> usa = new ArrayList<List<String>>();

		usa.add(newyork);
		usa.add(losangeles);

		System.out.println("USA:" + usa);

		System.out.println("=========");

		List<List<List<String>>> world = new ArrayList<List<List<String>>>();

		world.add(india);
		world.add(usa);

		System.out.println("WORLD :" + world);

		Iterator<List<List<String>>> itr1 = world.iterator();
		while (itr1.hasNext()) 
		{
			List<List<String>> state = itr1.next();

			Iterator<List<String>> itr2 = state.iterator();
			while (itr2.hasNext()) 
			{
				List<String> city = itr2.next();

				Iterator<String> itr3 = city.iterator();
				while (itr3.hasNext()) 
				{
					String worlds = itr3.next();
					System.out.println(worlds);
				}
			}
		}

		System.out.println("======LAMBDA=====");
		world.forEach((state)->state.forEach((city)->city.forEach((name)->System.out.println(name))));
		
		System.out.println("=====BY USING FOREACH=====");
		world.forEach((state) -> state.forEach((city) -> city.forEach(System.out::println)));

		
		System.out.println("=====BY USING ENHANCE FOR LOOP======");
		
			
		for(List<List<String>> x:world)
		{
			//System.out.println(x);
			
			for(List<String> y:x)
			{
				//System.out.println(y);
				
				for(String s:y)
				{
					System.out.println(s);
				}
				
			}
			
			
		}
	}

}
