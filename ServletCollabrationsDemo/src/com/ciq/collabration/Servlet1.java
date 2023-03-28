package com.ciq.collabration;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		String msg = request.getParameter("msg");
//	response.sendRedirect("welcome.html");
//	response.sendRedirect("https://www.javatpoint.com/servlet-tutorial");
//		request.getRequestDispatcher("welcome.html").include(request, response);
//		writer.println(msg);
		writer.println(msg);
		request.getRequestDispatcher("two").include(request, response);

	}

//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		req.getRequestDispatcher("two").forward(req, resp);
//		doPost(req, resp);
//
//	}

}
