package C_Example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test_3_Scanner {

	public static void main(String[] args) {
		
		List<Student> list =new ArrayList<Student>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter How Many Student Do You Have Want To Add");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter rollno and name");
			Student stu=new Student(sc.nextInt(),sc.next()+sc.nextLine());
			list.add(stu);
		}
		
		list.forEach(System.out::println);
		//OR
		//lambda
		list.forEach((stu)->
					{
						System.out.println(stu.getRollno());
						System.out.println(stu.getName());
					});
	}
}
