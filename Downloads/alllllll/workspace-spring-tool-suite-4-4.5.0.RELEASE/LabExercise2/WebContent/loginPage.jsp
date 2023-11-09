<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<form name="LoginForm" method="post" action="Auth">

		<label for="username">Username:</label> 
		<input type="text" id="username" name="username"> 
		
		<label for="pwd">Password:</label>
		<input type="password" id="pwd" name="password"> 
		
		<input type="submit" value="Login">
	</form>

</body>
</html>