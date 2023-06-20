package SaurabhSir;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo1_update {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sepbatch", "root", "root");

		String update = "update teacher set name='Pravin' ,age=24 where rollno=101";

		Statement stmt = con.createStatement();

		stmt.executeUpdate(update);

		con.close();
		stmt.close();

		System.out.println("done");

	}

}
