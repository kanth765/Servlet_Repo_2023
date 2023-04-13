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
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String user = request.getParameter("userName");
		String pwd = request.getParameter("password");
		HttpSession session = request.getSession();

		if (user.equalsIgnoreCase("admin") && pwd.equalsIgnoreCase("admin")) {
			session.setAttribute("session", "empSession");
//			Cookie ck=new Cookie("user","sonoo jaiswal");//creating cookie object  
//			response.addCookie(ck);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}else {
			request.setAttribute("msg", "username or pwd incorrect");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

}
