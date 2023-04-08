<%@page import="com.ciq.ems.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
#customers {
	font-family: Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

#customers td, #customers th {
	border: 1px solid #ddd;
	padding: 8px;
}

#customers tr:nth-child(even) {
	background-color: #f2f2f2;
}

#customers tr:hover {
	background-color: #ddd;
}

#customers th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color: #04AA6D;
	color: white;
}
</style>
</head>
<body>

	<h1>Employe Information</h1>

	<h3>
		<a href="emp-save.jsp">Add Employee</a>
	</h3>
	<%
	List<Employee> employees = (List<Employee>) request.getAttribute("list");
	%>
	<%
	String message = (String) request.getAttribute("msg");

	out.println("<h5 style='color:blue'>" + message + "</h5>" + "<br>");
	%>

	<table id="customers">
		<tr>
			<th>EID</th>
			<th>Ename</th>
			<th>salary</th>
			<th>Email</th>
			<th>Action</th>
		</tr>
		<%
		for (Employee employee : employees) {
		%>
		<tr>
			<td><%=employee.getId()%></td>
			<td><%=employee.getName()%></td>
			<td><%=employee.getSalary()%></td>
			<td><%=employee.getEmail()%></td>
			<td><a href="update?id=<%=employee.getId()%>">update</a> <a
				href="delete?id=<%=employee.getId()%>">delete</a></td>
		</tr>
		<%
		}
		%>
		<tr>
		</tr>

	</table>


</body>
</html>