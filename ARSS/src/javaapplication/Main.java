package javaapplication;

import java.sql.DriverManager;
import java.sql.*;

public class Main 
{
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
		Statement stm = con.createStatement();
		
		String findThis = "1000";
		String found = "";
		
		ResultSet rs = stm.executeQuery("SELECT * from administrator");
		
		while (rs.next())
		{
			found = rs.getString(1);		
			
			System.out.print(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + "\n");
			
		}	
		
		rs.close();
		stm.close();
		con.close();
		
	}
}
