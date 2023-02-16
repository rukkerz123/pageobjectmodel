package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.xdevapi.Result;

public class driver {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "Venkat@1997");
			Statement stmt1 = con.createStatement();
			ResultSet rs = stmt1.executeQuery("select* from customertable1");

			while (rs.next()) {
				System.out.println(rs.getInt(1) + "" + rs.getString(2) + "" + rs.getInt(3));
			}
		}

		catch (Exception e) {

			System.out.println(e);
		}
	}

}
