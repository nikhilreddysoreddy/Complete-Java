

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("controller is in first servlet");
		RequestDispatcher reqDispatcher=request.getRequestDispatcher("\\SecondServlet");
		reqDispatcher.include(request, response);
		
		PrintWriter writer = response.getWriter();
		writer.println("Response from the first servlet..");
	}

}
