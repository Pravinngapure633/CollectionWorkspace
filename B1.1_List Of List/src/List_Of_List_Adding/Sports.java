  package List_Of_List_Adding;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sports {
	
	public static void main(String[] args) {
		
		List<String> cricket=new ArrayList<String>();
		
		cricket.add("For Cricket equipments:-");
		cricket.add("Bat");
		cricket.add("Ball");
		cricket.add("Stump");
		cricket.add("Helmet");
		
		List<String> football=new ArrayList<String>();
		football.add("For Football Equipment:-");
		football.add("Glubs");
		football.add("Ball");
		football.add("Helmet");
		football.add("Shoes");
		
		
		List<String> batminton=new ArrayList<String>();
		batminton.add("For Batminton equipment:- ");
		batminton.add("Racket");
		batminton.add("Net");
	
		List<String> carrom=new ArrayList<String>();
		carrom.add("For Carrom Equipment:-");
		carrom.add("Powder");
		carrom.add("Stand");
		carrom.add("Carrom Bord");
		carrom.add("Light");
		
		List<String> pool=new ArrayList<String>();
		pool.add("For Pool Equipment:-");
		pool.add("Stic");
		pool.add("Balls");
		pool.add("Pool Table");
		pool.add("Point Table Bord");
		
		List<List<String>> sport=new ArrayList<List<String>>();
		
			sport.add(cricket);
			sport.add(football);
			sport.add(batminton);
			sport.add(carrom);
			sport.add(pool);
			
			Iterator<List<String>> itr=sport.iterator();
			while(itr.hasNext())
			{
				List<String> l=itr.next();
				Iterator <String> itr1=l.iterator();
				while(itr1.hasNext())
				{
					String l1= itr1.next();
					System.out.println(l1);
				}
			} 
			System.out.println("====inhance for loop=====");
			for(List<String> s:sport)
			{
				for(String ss:s)
				{
					System.out.println(ss);
				}
			}
			System.out.println("==lambda==");
			sport.forEach((s)->s.forEach((ss)->System.out.println(ss)));
			
			System.out.println("====method reference===");
			sport.forEach((s)->s.forEach(System.out::println));
		
		
		
		
				
		
		
		
	}

}
