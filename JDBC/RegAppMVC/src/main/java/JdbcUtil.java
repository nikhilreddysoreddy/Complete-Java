import java.sql.*;

public class JdbcUtil {
	static
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws SQLException {
		String url="jdbc:mysql://localhost:3306/telusko_db";
		String user="root";
		String dbPass="nikhil23";
		return DriverManager.getConnection(url, user, dbPass);
	}
	public static void closeConnection(Connection conn,Statement stmt) {
		try 
		{
			conn.close();
			stmt.close();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
