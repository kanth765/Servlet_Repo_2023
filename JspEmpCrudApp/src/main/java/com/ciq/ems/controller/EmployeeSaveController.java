package com.ciq.ems.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ciq.ems.dao.EmployeeDaoImpl;
import com.ciq.ems.model.Employee;

/**
 * Servlet implementation class EmployeeSaveController
 */
public class EmployeeSaveController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		double sal = Double.parseDouble(request.getParameter("salary"));
		String email = request.getParameter("email");
		Employee employee = new Employee(id, name, sal, email);
		EmployeeDaoImpl dao = new EmployeeDaoImpl();
		request.setAttribute("msg", "inserted successfully!!!");
		dao.save(employee);
		
		request.getRequestDispatcher("findAll").forward(request, response);
		
	}

}
