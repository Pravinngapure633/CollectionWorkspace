package preparedCall;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class Demo_FeatchAllData {
	
	public static void main(String[] args) throws Exception {
	
		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/sepbatch";
		String username = "root";
		String password = "root";

		Connection con = DriverManager.getConnection(url, username, password);

		CallableStatement cs = con.prepareCall("{call featchAllData()}");

		

		ResultSet rs = cs.executeQuery();

		while(rs.next())
		{
		System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
		}
		cs.executeUpdate();
		con.close();
		cs.close();
		System.out.println("Table created");

	}

}
