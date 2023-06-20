package Program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class A {

	public static void main(String[] args) throws Exception {
		
		//Step-1 Load Driver Class
		Class.forName("com.mysql.jdbc.Driver");
		
		//Step-2 Establish Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		
		//Step-3 Create Quary
		String sql = "create table Student(rollno int, name varchar(45), addr varchar(45))";
		
		//Step-4 create Statement
		Statement stmt = con.createStatement();
		
		//Step-5 Submit Quary
		stmt.execute(sql);
		
		//Step-6 Close Connection
		stmt.close();
		con.close();
		
		System.out.println("Table Created");
	}
}
