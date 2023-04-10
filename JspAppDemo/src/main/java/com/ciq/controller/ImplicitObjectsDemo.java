package com.ciq.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ImplicitObjectsDemo
 */
public class ImplicitObjectsDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletContext context = request.getServletContext();
		context.setAttribute("appScope", "application");
		HttpSession session = request.getSession();
		session.setAttribute("season", "summer");
		request.setAttribute("weather", "very heat");
		ServletConfig servletConfig = getServletConfig();
		request.getRequestDispatcher("implicit.jsp").forward(request, response);

	}

}
