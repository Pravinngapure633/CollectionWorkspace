package Program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class B1_SC {
	
	public static void main(String[] args) throws Exception {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rollno, name,addr");
		//
		Class.forName("com.mysql.jdbc.Driver");
		
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		
		
		//St-3
		int rn=sc.nextInt();
		String name=sc.next();
		String addr=sc.next();
		
		String sql="insert into student1 values ("+rn+",'"+name+"','"+addr+"')";
		
		//st-4
		Statement stmt = con.createStatement();
		
		//st-5
		stmt.execute(sql);
		
		//st-6
		stmt.close();
		con.close();
		
		System.out.println("record inserted");
		
	}

}
