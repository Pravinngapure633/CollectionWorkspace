package preparedCall;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Demo_CreateTable1 {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/sepbatch";
		String username="root";
		String password="root";
	
		Connection con = DriverManager.getConnection(url, username, password);
		
		CallableStatement cs = con.prepareCall("{call insertTable()}");
		
		cs.execute();
		con.close();
		cs.close();
		System.out.println("Table created");
	}
}
