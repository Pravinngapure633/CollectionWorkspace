package preparedCall;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class Demo_featch_Singledata {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/sepbatch";
		String username = "root";
		String password = "root";

		Connection con = DriverManager.getConnection(url, username, password);

		CallableStatement cs = con.prepareCall("{call featchSingleData(?)}");

		System.out.println("Enter eid");
		cs.setInt(1, sc.nextInt());

		ResultSet rs = cs.executeQuery();

		rs.next();
		System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));

		cs.executeUpdate();
		con.close();
		cs.close();
		System.out.println("Table created");

	}

}
