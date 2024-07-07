package com.telusko.jdbclearning;
import java.sql.*;
public class UtilJdbc {
	static 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws SQLException
	{
		String url="jdbc:mysql://localhost:3306/jdbclearning";
		String user="root";
		String pass="nikhil23";
		return DriverManager.getConnection(url, user, pass);
	}
	public static void closeConnection(Connection conn,Statement stmt) throws SQLException 
	{
		conn.close();
		stmt.close();
	}
}
