<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.model.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Page</title>
</head>
<body>
	<h1>Admin Page</h1>
	<p>You are successfully logged in!</p>
	<%
		User user=(User)request.getAttribute("user");
		out.print("Welcome " + user.getUserName());
	%>
</body>
</html>