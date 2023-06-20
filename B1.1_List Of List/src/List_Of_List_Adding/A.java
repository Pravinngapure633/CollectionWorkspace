package List_Of_List_Adding;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A {

	public static void main(String[] args) {

		List<String> mh = new ArrayList<String>();
		mh.add("Pune");
		mh.add("NAgpur");
		mh.add("Kolhapur");

		List<String> goa = new ArrayList<String>();
		goa.add("Panjim");
		goa.add("Vasco");
		goa.add("Madgao");

		List<List<String>> l = new ArrayList<List<String>>();

		l.add(mh);
		l.add(goa);

		System.out.println("List:" + l);

		Iterator<List<String>> itr = l.iterator();
		while (itr.hasNext()) {
			List<String> state = itr.next();
			System.out.println("State:" + state);

			Iterator<String> itr2 = state.iterator();
			while (itr2.hasNext()) {
				String city = itr2.next();
				System.out.println(city);
			}
		}

	}

}
