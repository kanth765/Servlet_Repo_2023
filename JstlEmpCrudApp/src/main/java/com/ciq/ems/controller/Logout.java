package com.ciq.ems.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Logout
 */
@WebServlet("/logout")
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		Cookie ck=new Cookie("user","");//deleting value of cookie  
//		ck.setMaxAge(0);//changing the maximum age to 0 seconds  
//		response.addCookie(ck);//adding cookie in the response  
//		System.out.println(ck.getName());
		HttpSession session = request.getSession(false);
		session.setMaxInactiveInterval(10);
		String attribute = (String) session.getAttribute("session");
		System.out.println(attribute);
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

}
