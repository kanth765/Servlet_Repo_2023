package com.ciq.ems.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ciq.ems.service.EmployeeServiceImpl;

/**
 * Servlet implementation class EmployeeDeleteController
 */
//@WebServlet("/delete")
public class EmployeeDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doget of delete controller method started execution....");
		EmployeeServiceImpl service = new EmployeeServiceImpl();
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println("delete service method calling delete method.....");
		request.setAttribute("msg", "deleted successfully!!!");
		service.delete(id);
		request.getRequestDispatcher("findAll").forward(request, response);
		System.out.println("doget of delete controller method stops execution....");
	}

}
