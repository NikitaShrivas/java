package Com.Rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestConnection {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		 
		 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava", "root", "root");
		 
		 Statement stmt = conn.createStatement();
		 
		System.out.println("Connection Succesfull");
		 
		 ResultSet rs = stmt.executeQuery("Select * from employee");
		 
		 while (rs.next()) {
				System.out.print(rs.getInt(1));
				System.out.print("\t " + rs.getString(2));
				System.out.print("\t " + rs.getString(3));
				System.out.println("\t " + rs.getInt(4));
			}
		 
	}

}
