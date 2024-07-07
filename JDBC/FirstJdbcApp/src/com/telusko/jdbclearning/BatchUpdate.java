package com.telusko.jdbclearning;
import java.sql.*;

public class BatchUpdate {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		try 
		{
			conn=UtilJdbc.getConnection();
			String query="UPDATE studentinfo set sage=? where id=?";
			pstmt=conn.prepareStatement(query);
//			Scanner sc=new Scanner(System.in);
			pstmt.setInt(1, 21);
			pstmt.setInt(2, 1);
			pstmt.addBatch();
			pstmt.setInt(1, 21);
			pstmt.setInt(2, 2);
			pstmt.addBatch();
			pstmt.setInt(1, 21);
			pstmt.setInt(2,3);
			pstmt.addBatch();
			pstmt.setInt(1, 21);
			pstmt.setInt(2, 4);
			pstmt.addBatch();
			int[] re=pstmt.executeBatch();
			for(int i:re) {
				System.out.println(i+" ");
			}
		} 
		catch (Exception e) 
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
