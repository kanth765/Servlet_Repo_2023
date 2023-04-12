package com.ciq.ems.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ciq.ems.dao.EmployeeDaoImpl;
import com.ciq.ems.service.EmployeeServiceImpl;

/**
 * Servlet implementation class EmployeeFindAllController
 */
public class EmployeeFindAllController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		response.getWriter();
		System.out.println("doget service method starts execution......");
		EmployeeServiceImpl service = new EmployeeServiceImpl();
		request.setAttribute("list", service.getEmployees());
		request.getRequestDispatcher("list-emp.jsp").forward(request, response);
		System.out.println("doget service method stops execution......");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("dopost service method starts execution......");
		doGet(request, response);
	}

}
