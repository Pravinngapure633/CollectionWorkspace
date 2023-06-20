package indexOf_Method;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A {

	public static void main(String[] args) {

		List l = new ArrayList();
		l.add(0, 10);
		l.add(1, 30);
		l.add(2, 20);
		l.add(3, 30);
		l.add(4, 40);
		l.add(5, 30);

		System.out.println("List:" + l);

		Iterator itr = l.iterator();
		while (itr.hasNext()) {
			Object o = itr.next();
			if (o instanceof Integer)
			{
				int i=(int)o;
				if(i==30)
				System.out.println(l.indexOf(i));
			}
		}
	}
}
