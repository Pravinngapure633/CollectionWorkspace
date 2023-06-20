package SaurabhSir;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo1_1_featch {
	
	
	public static void main(String[] args) throws Exception
	{

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sepbatch", "root", "root");
		
		//only for fetch
		String fetch = "select * from teacher";
		
		Statement stmt = con.createStatement();
				
		ResultSet rs = stmt.executeQuery(fetch);
		
		while (rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
		}
		
		con.close();
		stmt.close();
		
		System.out.println("done");

	}}
