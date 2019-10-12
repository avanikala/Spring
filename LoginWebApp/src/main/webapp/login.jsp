<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	${logonerror}
	<form action="login" method="post">
		User Name <br>
		<input type="text" name="username" placeholder="Enter name"><br>
		Password <br>
		<input type="text" name="password" placeholder="Enter password"><br>
		<button type="submit">Login</button>
	</form>
</body>
</html>