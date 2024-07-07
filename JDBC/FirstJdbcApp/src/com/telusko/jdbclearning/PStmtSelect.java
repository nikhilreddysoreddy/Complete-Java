package com.telusko.jdbclearning;
import java.sql.*;
public class PStmtSelect {

	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try 
		{
			conn=UtilJdbc.getConnection();
			String query="SELECT * FROM studentinfo";
			pstmt=conn.prepareStatement(query);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("id")+"   "+rs.getString("sname")+"   "+rs.getInt("sage")+"   "+rs.getString("scity"));
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				UtilJdbc.closeConnection(conn, pstmt);
			} 
			catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
	}
}
