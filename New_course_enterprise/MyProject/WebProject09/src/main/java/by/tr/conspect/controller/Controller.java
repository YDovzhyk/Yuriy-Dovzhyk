package by.tr.conspect.controller;

import java.io.IOException;

import by.tr.conspect.bean.User;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Controller() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		User user = new User();
		user.setName("Vasya");
		user.setYearBirthday(1991);

		request.setAttribute("user", user);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/jsp/main.jsp");
		requestDispatcher.forward(request, response);
		
	}

}
