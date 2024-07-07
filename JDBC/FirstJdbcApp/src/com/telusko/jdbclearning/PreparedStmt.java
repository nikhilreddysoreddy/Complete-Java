package com.telusko.jdbclearning;
import java.util.*;
import java.sql.*;
public class PreparedStmt {

	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement stmt=null;
		
		try
		{
			conn=UtilJdbc.getConnection();
			String query="insert into studentinfo(id,sname,sage,scity) values(?,?,?,?)";
			stmt=conn.prepareStatement(query);
			System.out.println("Enter the following details to enter into DB");
			Scanner sc=new Scanner(System.in);
			for(int i=1;i<=3;i++) 
			{
				System.out.println("Enter the id :");
				int id=sc.nextInt();
				System.out.println("Enter the name :");
				String name=sc.next();
				System.out.println("Enter the age :");
				int age=sc.nextInt();
				System.out.println("Enter the city :");
				String city=sc.next();
				stmt.setInt(1, id);
				stmt.setString(2,name);
				stmt.setInt(3,age);
				stmt.setString(4,city);
				int ar=stmt.executeUpdate();
				if(ar==0) {
					System.out.println("not able to execute query");
				}
				else {
					System.out.println("Record added successfully");
				}
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			try {
				UtilJdbc.closeConnection(conn, stmt);
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
