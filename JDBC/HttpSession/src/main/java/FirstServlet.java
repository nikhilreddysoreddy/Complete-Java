

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("username");
		String email=request.getParameter("email");
		HttpSession session = request.getSession();
		session.setAttribute("name",name);
		RequestDispatcher reqDispatcher=request.getRequestDispatcher("\\SecondServlet");
		reqDispatcher.forward(request, response);
		PrintWriter writer = response.getWriter();
		writer.println("hii "+name+" response is coming from first servlet..");
		writer.close();
		
	}
}
