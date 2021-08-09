<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Counter</title>
</head>
<body>
	<%  %>
	<p> You have visited <a href="http://localhost:8080/">http://localhost:8080/</a> <c:out value="${countToShow}" /> times </p>
	<br>
	<a href="http://localhost:8080/">Test another visit?</a>
	<br>
	<a href="http://localhost:8080/add2">Lets add 2 to the count</a>
	<br>
	<a href="http://localhost:8080/reset">Reset</a>
</body>
</html>