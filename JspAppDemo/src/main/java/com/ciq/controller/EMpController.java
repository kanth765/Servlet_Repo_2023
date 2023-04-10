package com.ciq.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ciq.model.Employee;

/**
 * Servlet implementation class EMpController
 */
public class EMpController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Employee emp = new Employee(1, "anil", 22000.00);
		request.setAttribute("employee", emp);
		request.getRequestDispatcher("reading_form_EL.jsp").forward(request, response);
	}

}
