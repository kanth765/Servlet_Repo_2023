package com.ciq.ems.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ciq.ems.model.Employee;
import com.ciq.ems.service.EmployeeServiceImpl;

public class EmployeeUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doget of delete controller method started execution....");
		EmployeeServiceImpl service = new EmployeeServiceImpl();
		int id = Integer.parseInt(request.getParameter("id"));
		Employee employee = service.getById(id);
		request.setAttribute("employee", employee);
		request.getRequestDispatcher("emp-update.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		EmployeeServiceImpl service = new EmployeeServiceImpl();
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		double sal = Double.parseDouble(request.getParameter("salary"));
		String email = request.getParameter("email");
		Employee employee = new Employee(id, name, sal, email);
		request.setAttribute("msg", "updated successfully!!!");
		service.update(employee);
		request.getRequestDispatcher("findAll").forward(request, response);

	}

}
