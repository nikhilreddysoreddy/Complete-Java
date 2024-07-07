
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/FirstServlet")
public class ServletApp1 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String name=request.getParameter("username");
		String email=request.getParameter("email");
		String pass=request.getParameter("password");
		String cPass=request.getParameter("confirm-password");
		PrintWriter pr=response.getWriter();
		if(pass.equals(cPass)) {
			pr.println("Congrats You have Successfully registered...");
		}
		else {
			pr.println("please enter same password in both fields..");
		}
		pr.close();
	}
}
