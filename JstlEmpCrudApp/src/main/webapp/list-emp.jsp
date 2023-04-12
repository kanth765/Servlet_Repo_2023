<%@page import="com.ciq.ems.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
	 
	<c:if test="${msg!=null}">
		<h5 style='color: blue'>
			<c:out value="${msg}"></c:out>
		</h5>
	</c:if>

	<table id="customers">
		<tr>
			<th>EID</th>
			<th>Ename</th>
			<th>salary</th>
			<th>Email</th>
			<th>Action</th>
		</tr>
		<c:forEach var="employee" items="${list}">
			<tr>
				<td><c:out value="${employee.getId()}"></c:out> </td>
				<td><c:out value="${employee.getName()}"></c:out> </td>
				<td>${employee.getSalary()}</td>
				<td>${employee.getEmail()}</td>
				<td><a href="update?id=${employee.getId()}">update</a> <a
					href="delete?id=${employee.getId()}">delete</a></td>
			</tr>
		</c:forEach>
		<tr>
		</tr>

	</table>


</body>
</html>