<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>@RequestMapping and @RequestParam Test Results 2</title>
</head>
<body>
	<div align="center">
		<h1>${testserial}: @RequestMapping and @RequestParam Test Results</h1>
		<c:forEach var="parameter" items="${param}">
			<h3 style="color:#DF0101"><c:out value="${parameter.key}"/> = <c:out value="${parameter.value}"/></h3>
		</c:forEach>
	</div>
</body>
</html>