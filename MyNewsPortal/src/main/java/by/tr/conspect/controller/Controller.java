package by.tr.conspect.controller;


import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String requestType;

	public Controller() {
		super();
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(arg0, arg1);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		String requestType = request.getParameter("page");
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		
		   String login = request.getParameter("login");
		   String password = request.getParameter("password");
		   
		   if(login != "" & password != "") {
			   PrintWriter out = response.getWriter();
			   out.println("You have entered the site");
		   }
			else {
				PrintWriter out = response.getWriter();
				out.println("Fill in the required fields");
			}   
		   System.out.println("Your login: " + login);
		   System.out.println("Your password: " + password);
	}
	
	private void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		response.setContentType("text/html");
		String requestType = request.getParameter("page");
		System.out.println(requestType);
		 
		if(requestType.equals("registration")) {
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/jsp/registration.jsp");
		requestDispatcher.forward(request, response);
		} 
		if(requestType.equals("login")) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
			requestDispatcher.forward(request, response);	
		}	
	}
}
