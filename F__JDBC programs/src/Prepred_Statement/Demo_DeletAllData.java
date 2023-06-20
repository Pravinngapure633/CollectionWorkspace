package Prepred_Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo_DeletAllData {
	
	public static void main(String[] args) {



		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sepbatch", "root", "root");

			String delet = "delete from student";

			PreparedStatement ps = con.prepareStatement(delet);

			ps.executeUpdate();

			con.close();
			ps.close();

			System.out.println("Done");

		} catch (ClassNotFoundException c) {
			c.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


}
