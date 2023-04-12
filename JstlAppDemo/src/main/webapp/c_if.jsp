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

	<c:set var="age" value="71"></c:set>



<c:if test="${age >=20 && age <=65 }"> 
	<p>person is in service</p>
</c:if>

<c:otherwise > 
	<p>Retired from service</p>
</c:otherwise>
	 
	
	
</body>
</html>