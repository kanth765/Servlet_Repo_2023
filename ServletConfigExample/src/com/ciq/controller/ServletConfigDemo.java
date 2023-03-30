package com.ciq.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletConfigDemo
 */
public class ServletConfigDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 

	@Override
	public void init(ServletConfig config) throws ServletException {
		String user = config.getInitParameter("user");
		String pwd = config.getInitParameter("pwd");
		System.out.println(user + "" + pwd);
		super.init(config);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		ServletConfig servletConfig = getServletConfig();
		String user = servletConfig.getInitParameter("user");
		String pwd = servletConfig.getInitParameter("pwd");
		out.println("<b>UserName:" + user + "<b><br>");
		out.println("<i>Password:" + pwd + "<i><br>");
	}

}
