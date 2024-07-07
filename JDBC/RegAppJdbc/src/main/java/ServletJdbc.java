

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/ServletJdbc")
public class ServletJdbc extends HttpServlet {
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("control is in servlet");
		
		String name=request.getParameter("username");
		String email=request.getParameter("email");
		String pass=request.getParameter("password");
		String cpass=request.getParameter("confirm-password");
		
		Connection connect=null;
		PreparedStatement pstmt=null;
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/telusko_db";
	        String dbPass="nikhil23";
	        String user="root";
	        connect=DriverManager.getConnection(url, user, dbPass);
	        pstmt=connect.prepareStatement("INSERT INTO personalinfo(uname,email,pass,cpass) values(?,?,?,?)");
			
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setString(3, pass);
			pstmt.setString(4, cpass);
			
			int ar=pstmt.executeUpdate();
			PrintWriter writer = response.getWriter();
			if(ar!=0) {
				writer.println("Registered Successfully...");
			}
			else {
				writer.println("Registration not successful...");
			}
			writer.close();
			connect.close();
			pstmt.close();
		} 
		catch (Exception e)
		{
			
			e.printStackTrace();
		}
		finally {
			try
			{
				connect.close();
				pstmt.close();
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
