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

	<c:set var="salary" value="6000"></c:set>

	<c:choose>
		<c:when test="${salary >10000}">
			<p>Paying High Salary</p>
		</c:when>

		<c:when test="${salary >=5000 && salary<=10000}">
			<p>Paying Normal Salary</p>
		</c:when>

		<c:otherwise>
			<p>No Comment</p>
		</c:otherwise>
	</c:choose>







</body>
</html>