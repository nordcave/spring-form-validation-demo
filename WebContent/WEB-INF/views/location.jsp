<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Location details</title>

<!------- Internal CSS styling -->
<style>
	input[type=text] {
		padding: 10px;        /* -- declaration block -- */
		margin: 10px;
		font-size: 20px;
	}
	
	input[type=submit] {
		border: none;
		background-color: #4CAF50;
		color: white;
		padding: 16px;
		margin: 16px;
		font-size: 20px;
	}
	
	h2 {
		color: #08298A;
		text-alighn: center;
	}
	
</style>
<!------- Internal CSS styling -->

</head>
<body>
<!-- Overriding color -->
	<h2 style="color: #DF0101; text-align:center"><c:out value="${greeting}"></c:out>
	</h2>
	<hr/>
	<div style="text-align:center">
	<h2>Submit your location for a list of Organization</h2>
	
	
		<form action="listOrgs">
			<input type="text" name="locationName"><br/>
			<input type="submit" name="Get Organizations"><br/>
		</form>
	</div>
</body>
</html>