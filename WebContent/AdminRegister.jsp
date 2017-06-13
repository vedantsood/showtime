<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Sign Up!</title>
</head>
<body>
<center>
<form action="AdminServlet" method="post" id="signupform">
<h1>Admin Sign Up!</h1>
<table>
<tr><td>Name</td><td><input type="text" id="name" name="name"></td></tr>
<tr><td>Email</td><td><input type="email" id="email" name="email"></td></tr>
<tr><td>Date of Birth</td><td><input type="date" id="dob" name="dob"></td></tr>
<tr><td>Contact</td><td><input type="text" id="contact" name="contact"></td></tr>
<tr><td>Password</td><td><input type="password" id="password" name="password"></td></tr>
<tr><td>Confirm Password</td><td><input type="password" id="confirmpassword" name="confirmpassword"></td></tr>
<tr><td colspan="2" align="center"><input type="submit" value="Sign Up"></td></tr>
<tr><td colspan="2" align="center">Already Registered? <a href="Login.jsp">Sign in</a></td></tr>
</table>
</form>
</center>
</body>
</html>