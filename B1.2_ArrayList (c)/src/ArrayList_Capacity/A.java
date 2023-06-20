package ArrayList_Capacity;

import java.util.ArrayList;
import java.util.List;

public class A {

	public static void main(String[] args) {
		
		List capacity=new ArrayList();
		//basic capacity is 10
		
		capacity.add(10);
		capacity.add(20);
		capacity.add(30);
		capacity.add(40);
		capacity.add(50);
		capacity.add(60);
		capacity.add(70);
		capacity.add(80);
		capacity.add(90);
		capacity.add(100);
		
		//then add 11th element
		// formula =basic*3/2+1=10*3/2+1=16 
		//new list capacity is 16
		
		
		//then add 17element then 
		//16*3/2+1=25
		//new list capacity is 25
		
		
	}
}
