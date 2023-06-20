package com.cjc.manegment.service.client;

import java.util.Scanner;

import com.cjc.manegment.service.CJC;
import com.cjc.manegment.service.impl.Akrudi;

public class AdminTest {

	public static void main(String[] args) {

		CJC cjc = new Akrudi();

		Scanner sc = new Scanner(System.in);

		

		boolean flag=true;
		
		while(flag)
		{
			System.out.println("Enter 1 for Add Course");
			System.out.println("Enter 2 for View Course");
			System.out.println("Enter 3 for Add Faculty");
			System.out.println("Enter 4 for View Faculty");
			System.out.println("Enter 5 for Add Batch");
			System.out.println("Enter 6 for View Batch");
			System.out.println("Enter 7 for Add Student");
			System.out.println("Enter 8 for View Student");
			System.out.println("Enter 9 for Exit From Class");
		
		int ch=sc.nextInt();
		switch (ch) {
		case 1:
				cjc.addCourse();
			break;
		case 2:
				cjc.viewCourse();
			break;
		case 3:
				cjc.addFaculty();
			break;
		case 4:
				cjc.viewFaculty();
			break;
		case 5:
				cjc.addBatch();
			break;
		case 6:
				cjc.viewBatch();
			break;
		case 7:
				cjc.addStudent();
			break;
		case 8:
				cjc.viewStudent();
			break;
		case 9:
				System.out.println("******************Thank You******************");
				flag=false;
				
			break;
		default:
				System.err.println("!!!!!!!!!!!!Wrong Input Provided!!!!!!!!!!!!");
			
			break;
		}
	}
	}
}
