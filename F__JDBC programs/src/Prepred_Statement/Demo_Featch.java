package Prepred_Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo_Featch {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sepbatch","root","root");
			
			String featch = "Select * from student where rollno=?";
			
			PreparedStatement ps = con.prepareStatement(featch);
			
			System.out.println(" rollno");
			int rollno = sc.nextInt();
			ps.setInt(1, rollno);
			
			ResultSet rs = ps.executeQuery();
			
			rs.next();
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
			
			
		
			con.close();
			ps.close();
			System.out.println("Done");
		}
		catch (ClassNotFoundException c) {
			c.printStackTrace();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
