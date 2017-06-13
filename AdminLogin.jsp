<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AdminLogin here</title>
</head>
<body>
<center>
<h1>ADMIN LOGIN</h1>
<form action="AdminLoginServlet" method="post">
<table>
    <tr><td>Email</td><td><input type="text" name="email" /></td></tr>
	<tr><td>password</td><td><input type="password" name="pwd" /></td></tr>
	<tr><td></td><td><input type="submit" value="Login" /></td></tr>
	
</table>
</form>
</center>
</body>
</html>