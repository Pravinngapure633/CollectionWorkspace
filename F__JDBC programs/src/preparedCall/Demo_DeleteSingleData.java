package preparedCall;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class Demo_DeleteSingleData {
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/sepbatch";
		String username = "root";
		String password = "root";

		Connection con = DriverManager.getConnection(url, username, password);

		CallableStatement cs = con.prepareCall("{call deleteSingleData(?)}");

		System.out.println("Enter eid");
		cs.setInt(1, sc.nextInt());

		
		cs.executeUpdate();
		con.close();
		cs.close();
		System.out.println("Table created");

	}

}
