package com.te.casestudy.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.te.casestudy.dao.LoginDao;

@WebServlet("/loginref")
public class LoginReading extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	resp.setContentType("text/html");
		
		Integer id = Integer.parseInt(req.getParameter("id"));
		String password = req.getParameter("password");
		
		if(LoginDao.validate(id, password) == true) {
			RequestDispatcher rd = req.getRequestDispatcher("./user.jsp");
			rd.forward(req,resp);
			HttpSession session = req.getSession();
			session.setAttribute("name", id);
		}else {
			resp.sendRedirect("./loginfailed.jsp");
		}
		
	}
	}

