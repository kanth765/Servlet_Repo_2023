package com.ciq.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Myservlet extends HttpServlet {
//lifecycle and what are http service methods
//	get, post, put, delete
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("welcome to servlet programming");
		
		writer.println("<br></br>");
		writer.println("<h1 style='color:blue'> Http Servlet class</h1>");
		writer.println(123);
		writer.close();
	}
	
	// using servlet interface
	// generic servlet
	//http servlet

//	public String msg(String msg) {
//		return msg;
//	}

//	public static void main(String[] args) {
//		Myservlet mySer = new Myservlet();
//		mySer.msg("welcome to servlet programming");
//		PrintWriter writer = new PrintWriter(System.out);
//		writer.print(msg);
//
//	}

}
