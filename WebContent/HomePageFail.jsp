<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<font color="red"><label >Login failed. Please check your mobilenumber and network</label></font>
<form name="Recharge" action="/Paytm/Recharge" method="get">
mobilenumber:<input type="text" name="mobilenumber"></br>
network:<input type="text" name="network"></br>
amount:<input type="text" name="amount"></br>
<input type="submit" value="Proceed with recharge">
next recharge? Then <a href="Recharge.jsp">Click here to Recharge</a>
</form>
</body>
</html>