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
		<p><c:if test="${msg!=null}">
		<h5 style='color: red'>
			<c:out value="${msg}"></c:out>
		</h5>
		</c:if>
		</p>
	<form action="login" method="post">
		UserName: <input type="text" name="userName"> Password: <input
			type="password" name="password"> <input type="submit"
			value="login">
	</form>
</body>
</html>