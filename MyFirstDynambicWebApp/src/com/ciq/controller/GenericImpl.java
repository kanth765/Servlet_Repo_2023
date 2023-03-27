package com.ciq.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenericImpl extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter writer = res.getWriter();
		writer.println("welcome to generic servlet programming");

		writer.println("<br></br>");
		writer.println("<h1 style='color:red'> Generic Servlet class</h1>");
		writer.println(123);
		writer.close();
	}

}
