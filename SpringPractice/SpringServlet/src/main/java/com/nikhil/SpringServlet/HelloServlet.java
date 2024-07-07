package com.nikhil.SpringServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		System.out.println("Hello servlet..");
		res.setContentType("text/html");
		PrintWriter out =res.getWriter();
		out.println("<h1><b>hi there..</b></h1>");
	}
}
