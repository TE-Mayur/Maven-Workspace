//package com.te.casestudy.controllers;
//
//import java.io.IOException;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import com.te.casestudy.beans.EmployeesInfo;
//import com.te.casestudy.operations.LoginCheck;
//import com.te.casestudy.operations.WelcomePage;
//
///**
// * Servlet implementation class EmployeeServlets
// */
//@WebServlet("/login")
//public class EmployeeServlets extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//       
//	
//	private WelcomePage page = new WelcomePage();
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public EmployeeServlets() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		
//		RequestDispatcher dispatcher = request.getRequestDispatcher("/webapp/WEB-INF/Login.jsp");
//		dispatcher.forward(request, response);
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//		String userid = request.getParameter("empno");
//		String password = request.getParameter("password");
//		
//		LoginCheck.logCheck();
//		
//		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/user.jsp");
//		dispatcher.forward(request, response);
//	}
//
//}
