package com.ciq.rms.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ciq.ems.dao.EmployeeDaoImpl;
import com.ciq.ems.model.Employee;

public class EmployeeSaveController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		EmployeeDaoImpl dao = new EmployeeDaoImpl();
		PrintWriter writer = resp.getWriter();
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		double sal = Double.parseDouble(request.getParameter("salary"));
		String email = request.getParameter("email");
//		writer.println(id);
//		writer.println(name);
//		writer.println(sal);
//		writer.println(email);
		Employee employee = new Employee(id, name, sal, email);
//		System.out.println(employee);
//		writer.println(employee);
		dao.save(employee);
		request.getRequestDispatcher("findAll").forward(request, resp);
		writer.close();

	}

}
