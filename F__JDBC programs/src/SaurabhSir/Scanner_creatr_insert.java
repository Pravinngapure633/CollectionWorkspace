package SaurabhSir;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Scanner_creatr_insert {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sepbatch", "root", "root");

		// String create = "create table student(rollno int,name varchar(45),age
		// int,addr varchar(45))";

		System.out.println("Enter RollNo");
		int rollno = sc.nextInt();
		System.out.println("Enter Name");
		String name = sc.next() + sc.nextLine();
		System.out.println("Enter Age");
		int age = sc.nextInt();
		System.out.println("Enter Address");
		String addr = sc.next();

		String insert = "insert into student values(" + rollno + ",'" + name + "'," + age + ",'" + addr + "')";

		System.out.println("Enter Delete single data");
		String delet="delete from student where rollno="+sc.nextInt();
		

		Statement stmt = con.createStatement();

		// stmt.execute(create);
		stmt.execute(insert);
		stmt.execute(delet);

		con.close();
		stmt.close();

		System.out.println("Done");
	}

}
