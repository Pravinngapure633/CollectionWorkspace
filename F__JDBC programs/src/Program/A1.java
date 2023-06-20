package Program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class A1 {
	
	public static void main(String[] args) throws Exception {
		
		//Step-1 load Driver Class
		Class.forName("com.mysql.jdbc.Driver");
		
		//Step-2 Establish Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		
		//step-3 Create Quary
		String sql = "insert into Student values(104,'Vishal','nagpur'),(103,'pravin','pune')";
		
		//Step-4 Create Statement
		Statement stmt = con.createStatement();
		
		//Step-5 Submit Quary
		stmt.execute(sql);
		
		//Step-7 close connection
		stmt.close();
		con.close();
		
		System.out.println("Record Inserted");
		
		
	}
	
	

}
