package SaurabhSir;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo_create {
	
	public static void main(String[] args) throws Exception 
	{
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sepbatch", "root", "root");
		
		String createtable = "create table Teacher(rollno int,name varchar(45),age int)";
		
		String insetvalue = "insert into teacher values(101,'Saurabh',23)";
		
		Statement stmt = con.createStatement();
		
		stmt.execute(createtable);
		stmt.execute(insetvalue);
		
		con.close();
		stmt.close();
		System.out.println("Done");
	}

}
