<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<font color="red"><label >Login failed. Please check your Username and Password</label></font>
<form name="login" action="/Paytm/Login" method="get">
UserName:<input type="text" name="username"></br>
Password:<input type="password" name="pswd"></br>
<input type="submit" value="login"></br>
Create new account? Then <a href="Register.jsp">Click here to Register</a>
</form>
</body>
</html>