package Program;

import java.sql.Connection;
import java.sql.Statement;

public class Test_ {
	
	public static void main(String[] args) throws Exception {
		
		Connection con = DBUtil.getConnection();
		
		String sql = "update student1 set name='Saurabh' where rollno=101";
		
		Statement stmt = con.createStatement();
		
		stmt.executeUpdate(sql);
		
		stmt.close();
		con.close();
		System.out.println("Student update");
	}

}
