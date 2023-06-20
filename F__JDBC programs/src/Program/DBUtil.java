package Program;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	
	private static Connection con;
	
	public static Connection getConnection() throws Exception
	{
		if(con==null ||con.isClosed())
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				
				 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
				 return con;
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
		return con;
	}
	

}
