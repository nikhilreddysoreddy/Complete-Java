

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;



@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("username");
		String email=request.getParameter("email");
		String pass=request.getParameter("password");
		String cpass=request.getParameter("confirm-password");
		
		Model model=new Model();
		model.setName(name);
		model.setEmail(email);
		model.setPass(pass);
		model.setCpass(cpass);
		
		int ra=model.register();
		HttpSession session = request.getSession();
		session.setAttribute("name", name);
		if(ra==0) {
			response.sendRedirect("/RegAppMVC/Failure.jsp");
		}
		else {
			response.sendRedirect("/RegAppMVC/Success.jsp");
		}
	}

}
