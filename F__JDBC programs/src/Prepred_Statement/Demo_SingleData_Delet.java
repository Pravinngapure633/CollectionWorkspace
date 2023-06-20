package Prepred_Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo_SingleData_Delet {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sepbatch", "root", "root");

			String delet = "delete from student where rollno=?";

			PreparedStatement ps = con.prepareStatement(delet);

			System.out.println("Delete rollno");
			int rollno = sc.nextInt();
			ps.setInt(1, rollno);

			ps.executeUpdate();

			con.close();
			ps.close();

			System.out.println("Done");

		} 
		catch (ClassNotFoundException c) {
			c.printStackTrace();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
