package com.cjc.manegment.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.cjc.manegment.model.Batch;
import com.cjc.manegment.model.Course;
import com.cjc.manegment.model.Faculty;
import com.cjc.manegment.model.Student;
import com.cjc.manegment.service.CJC;

public class Akrudi implements CJC 
{
	Scanner sc=new Scanner(System.in);
	
	List<Course> clist=new ArrayList<Course>();
	List<Faculty> flist=new ArrayList<Faculty>();
	List<Batch> blist=new ArrayList<Batch>();
	List<Student> slist=new ArrayList<Student>();

	@Override
	public void addCourse() 
	{
		Course co=new Course();
		
		System.out.println("Enter Course Id Here");
		co.setCourseId(sc.nextInt());
		
		System.out.println("Enter Course Name Here");
		co.setCourseName(sc.next()+sc.nextLine());
		
		System.out.println("Enter Course Duration");
		co.setCourseDuration(sc.next()+sc.nextLine());
		
		System.out.println("Enter Course Fees");
		co.setCourseFees(sc.nextDouble());
		
		clist.add(co);
		
		System.out.println("***********Course Added SuccessFully************");
		
	}

	@Override
	public void viewCourse()
	{
		if(!clist.isEmpty())
		{
			Iterator<Course> itr=clist.iterator();
			while(itr.hasNext())
			{
				Course co = itr.next();
				System.out.println("**********Course Information**********");
				System.out.println("Cousre ID :"+co.getCourseId());
				System.out.println("Course NAME :"+co.getCourseName());
				System.out.println("Course DURATION :"+co.getCourseDuration());
				System.out.println("Cousre FEES :"+co.getCourseFees());
				
				System.out.println("**********************************");
				
			}
		}
		else
		{
			System.err.println("First Add Cousre And Then You Are Able To ViewS");
		}
	}

	@Override
	public void addFaculty() 
	{
		System.out.println("Enter Course ID Where You Want To Add Faculty");
		
		int ucid=sc.nextInt();
		
		for(Course c: clist)
		{
			if(ucid==c.getCourseId())
			{
				Faculty fa=new Faculty();
				
				System.out.println("Enter Faculty ID Here");
				fa.setFacultyId(sc.nextInt());
				System.out.println("Enter Faculty Name Here");
				fa.setFacultyName(sc.next()+sc.nextLine());
				System.out.println("Enter Faculty Experience Here");
				fa.setFacultyExperience(sc.next()+sc.nextLine());
				fa.setCourse(c);
				
				flist.add(fa);
				
				System.out.println("**********faculty Added SuccessFully**********");
			}
		}
		
	}

	@Override
	public void viewFaculty()
	{
	
		if(!flist.isEmpty())
		{
			System.out.println("***********Faculty Information***********");
			
			for(Faculty fa:flist)
			{
				System.out.println("Faculty ID :"+fa.getFacultyId());
				System.out.println("Faculty NAME :"+fa.getFacultyName());
				System.out.println("Faculty EXPERIENCE :"+fa.getFacultyExperience());
				System.out.println("**********************************");
				
			}
		}
		else
		{
			System.out.println("Enter Add Faculty Ande Then YOur Are Able To View");
		}
	}

	@Override
	public void addBatch() 
	{
		System.out.println("Enter Faculty ID Where You Want To ADD Batch");
		
		int ubid=sc.nextInt();
		
		for(Faculty fa:flist)
		{
			if(ubid==fa.getFacultyId())
			{
				Batch ba=new Batch();
				
				System.out.println("Enter Batch ID ");
				ba.setBatchId(sc.nextInt());
				System.out.println("Enter Batch Name");
				ba.setBatchName(sc.next()+sc.nextLine());
				ba.setFaculty(fa);
				
				blist.add(ba);
				
				System.out.println("**********Batch Added SuccessFully***********");
				
				
			}
		}
		
	}

	@Override
	public void viewBatch() 
	{
		if(!blist.isEmpty())
		{
			System.out.println("**********Batch Information*************");
			
			for(Batch b:blist)
			{
				System.out.println("Batch ID :"+b.getBatchId());
				System.out.println("Batch Name :"+b.getBatchName());
				System.out.println("**********************************");
			}
		}
		else
		{
			System.out.println("First Add Batch And Then You Are Able to View");
		}
	
		
	}

	@Override
	public void addStudent() 
	{
		System.out.println("Enter Batch ID Where You Want To Add Student");
		
		int usid=sc.nextInt();
		
		for(Batch b:blist)
		{
			if(usid==b.getBatchId())
			{
				Student st=new Student();
				System.out.println("Enter Student ID Here");
				st.setStudentId(sc.nextInt());
				System.out.println("Enter Student Name Here");
				st.setStudentName(sc.next()+sc.nextLine());
				st.setBatch(b);
				
				slist.add(st);
				
				System.out.println("************Student Added SuccessFully***********");
			}
		}
		
	}

	@Override
	public void viewStudent() {
		
		if(!slist.isEmpty())
		{
			System.out.println("*************Student Information*************");
			
			for(Student s:slist)
			{
				System.out.println("Student Id :"+s.getStudentId());
				System.out.println("Student Name :"+s.getStudentName());
				
				System.out.println("BATCH ID :"+s.getBatch().getBatchId());
				System.out.println("BATCH NAME :"+s.getBatch().getBatchName());
				System.out.println("FACULTY ID :"+s.getBatch().getFaculty().getFacultyId());
				System.out.println("FACULTY NAME :"+s.getBatch().getFaculty().getFacultyName());
				System.out.println("FACULTY EXPERIENCE :"+s.getBatch().getFaculty().getFacultyExperience());
				System.out.println("COURSE ID :"+s.getBatch().getFaculty().getCourse().getCourseId());
				System.out.println("COURSE NAME :"+s.getBatch().getFaculty().getCourse().getCourseName());
				System.out.println("COURSE DURATION :"+s.getBatch().getFaculty().getCourse().getCourseDuration());
				System.out.println("COURSE FEES :"+s.getBatch().getFaculty().getCourse().getCourseFees());
				System.out.println("***************************");
				
			}
		}
		else
		{
			System.out.println("First Add Student And Then You Are Able To View");
		}
		
	}

}
