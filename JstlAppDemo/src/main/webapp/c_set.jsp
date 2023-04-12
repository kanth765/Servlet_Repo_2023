<%@page import="com.ciq.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>core tag lib of c: set and c:out tags</h1>

	<c:set var="instituteName" value="createIQ"></c:set>


	<p>${instituteName}</p>

	<c:out value="${instituteName}"></c:out>
	<br>
	<c:out value="${instituteName1}" default="createiq tech"></c:out>
	<c:out value="${instituteName2}"></c:out>
	<p>c out can use in many ways</p>

	<%
	Employee employee = new Employee();
	request.setAttribute("emp", employee);
	%>

	<c:set target="${emp}" property="id" value="1"></c:set>
	<c:set target="${emp}" property="name" value="createiq"></c:set>
	<c:set target="${emp}" property="salary" value="22000"></c:set>
	<c:out value="${emp.id}"></c:out>
	<c:out value="${emp.name}"></c:out>
	<c:out value="${emp.salary}"></c:out>
</body>
</html>