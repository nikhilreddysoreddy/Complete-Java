

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("controller is in second Servlet..");
		
		HttpSession session = request.getSession(false);
		String name = (String) session.getAttribute("name");
		PrintWriter writer = response.getWriter();
		writer.println("hii "+name+" response is coming from Second servlet..");
		writer.close();
	}

}
