package com.ciq.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletInterfaceImpl implements Servlet {

	@Override
	public void destroy() {
		System.out.println("destroy!!!!");

	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public String getServletInfo() {
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init method.....");

	}

	@Override
	 public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter writer = res.getWriter();
		writer.println("welcome to servlet programming with interface!!!");
		writer.println("<br></br>");
		writer.println("<h1 style='color:green'>  Servlet interface implementation class</h1>");
		writer.close();

	}

}
