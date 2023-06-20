package Prepred_Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo_Insert{
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sepbatch","root","root");
			 
			 String insert = "insert into student values(?,?,?,?)";
			 
			 PreparedStatement ps = con.prepareStatement(insert);
			 
			
			 
			 
			 System.out.println("Enter Rollno");
			 int rollno=sc.nextInt();
			 ps.setInt(1, rollno);
			 
			 System.out.println("Enter Name");
			 String name=sc.next()+sc.nextLine();
			 ps.setString(2, name);
			 
			 System.out.println("Enter Age");
			 int age=sc.nextInt();
			 ps.setInt(3, age);
			 
			 System.out.println("Enter Addr");
			 String addr=sc.next()+sc.nextLine();
			 ps.setString(4, addr);
			 
			 ps.executeUpdate();
			 
			 con.close();
			 ps.close();
			 
			 System.out.println("Done");
			 
		}
		catch(ClassNotFoundException c)
		{
			c.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	

}
