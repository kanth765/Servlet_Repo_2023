package com.ciq.rms.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ciq.ems.dao.EmployeeDaoImpl;
import com.ciq.ems.model.Employee;
import com.ciq.ems.service.EmployeeServiceImpl;

//@WebServlet("/findAll")
public class EmployeeFindAllController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		EmployeeServiceImpl service = new EmployeeServiceImpl();
		List<Employee> employees = service.getEmployees();
//		writer.println("find all controller");
//		writer.println(employees);
		writer.println("<html>");
		writer.println("<body>");
			writer.println("<table border=1px>");
			writer.println("<tr><th>EID</th><th>ENAME</th><th>ESAL</th><th>EMAIL</th></tr>");
			for (Employee employee : employees) {
				writer.print("<tr>");
				writer.print("<td>" + employee.getId() + "</td>");
				writer.print("<td>" + employee.getName() + "</td>");
				writer.print("<td>" + employee.getSalary() + "</td>");
				writer.print("<td>" + employee.getEmail() + "</td>");
				writer.print("</tr>");
	
			}
		writer.println("</table>");

		writer.println("</body>");
		writer.println("</html>");
		writer.close();
	}

 
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
