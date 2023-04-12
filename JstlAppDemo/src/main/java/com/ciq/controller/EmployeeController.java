package com.ciq.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ciq.model.Employee;

/**
 * Servlet implementation class EmployeeController
 */
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Employee employee = new Employee(1, null, 23000);
		List<Employee> employees=new ArrayList<>();
		employees.add(employee);
		employees.add(employee);
		employees.add(employee);
		employees.add(employee);
		request.setAttribute("emps", employees);
		request.getRequestDispatcher("emp.jsp").forward(request, response);
	}

}
