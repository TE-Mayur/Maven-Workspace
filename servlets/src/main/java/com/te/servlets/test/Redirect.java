package com.te.servlets.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/redirect")
public class Redirect extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		String url = "http://localhost:8081/servlets/form";
		
		String url1 = "localhost:8081/servlets/new.html";
		
//		String url2 = "https://www.flipkart.com/";
				
				resp.sendRedirect(url1);
	}
}
