package com.te.servlets.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class SecondServer extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html"); //setting the content
		
		try {
			PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title> First </title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Hi Mayur Kumar Choudhary <h1>");
		out.println("</body>");
		out.println("</html>");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
