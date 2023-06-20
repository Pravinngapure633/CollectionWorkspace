package Ex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test 
{


	public static void main(String[] args) 
	{
		List<String> mh=new ArrayList<String>();
		mh.add("Pune");
		mh.add("Mumbai");
		
		List<String> goa=new ArrayList<String>();
		goa.add("Panjim");
		goa.add("Vasco");
		
		Map<String, List<String>> india=new HashMap<String, List<String>>();
		india.put("MAHARASTRA", mh);
		india.put("GOA", goa);
		
		System.out.println("=======");
		
		List<String> newyork=new ArrayList<String>();
		newyork.add("Las-Vegas");
		newyork.add("Mcxcdh");
		
		List<String> losAngelis=new ArrayList<String>();
		losAngelis.add("California");
		losAngelis.add("Florida");
			
		Map<String, List<String>> usa=new HashMap<String, List<String>>();
		usa.put("NEW_YOEK", newyork);
		usa.put("LOS-ANGELIS", losAngelis);
		
		
		Map<String, Map<String, List<String>>> world = new HashMap<>();
		world.put("INDIA", india);
		world.put("USA", usa);
		
		System.out.println(world);
		
		Set<String> keys = world.keySet();
		
		for(String key:keys)
		{
			//System.out.println(key);
			Map<String, List<String>> country = world.get(key);
			//System.out.println(country);
			Set<String> keys2 = country.keySet();
			for(String key2:keys2)
			{
			System.out.println(key2);
				List<String> state = country.get(key2);
				for(String city:state)
				{
				//	System.out.println(city);
				}
			}
			
		}
	}
}
