package com.telusko.jdbclearning;

import java.sql.*;

public class LaunchApp4 {

	public static void main(String[] args)
	{
		Connection connect=null;
		Statement statement=null;
		try 
		{
			connect=UtilJdbc.getConnection();
			statement=connect.createStatement();
			String query="UPDATE studentinfo set sage=24 WHERE id=2";
			int ar=statement.executeUpdate(query);
			if(ar==0) {
				System.out.println("not able to execute query");
			}
			else {
				System.out.println("record updated Successfully");
			}
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally 
		{
			try {
				UtilJdbc.closeConnection(connect, statement);
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
