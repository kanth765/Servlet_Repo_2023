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

	<h2>C: FOREACH WITH EMP OBJECT</h2>

	<c:forEach var="emp" items="${emps}">

		<c:choose>
			<c:when test="${emp.name!=null}">
				<c:out value="${emp.id}"></c:out>
				<c:out value="${emp.name}"></c:out>
				<c:out value="${emp.salary}"></c:out>
			</c:when>
			<c:otherwise>
				<p> No comment </p>
			</c:otherwise>
		</c:choose>

	</c:forEach>


</body>
</html>