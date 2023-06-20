package Method;

import java.util.Stack;

public class peek {


	public static void main(String[] args) {
		
			Stack s=new Stack();
			
			s.push(10);
			s.push(20);
			s.push(30);
			s.push(40);
			s.push(60);
			
			System.out.println(s);
			//stack list reverse rahte
			//print top element 
			int i=(int)s.peek();
			System.out.println(i);
	
	}
}
