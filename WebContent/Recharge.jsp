<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form name="Recharge" action="/Paytm/HomePage" method="get">
mobilenumber:<input type="text" vaue="mobilenumber"></br>
network:<input type="text" value="network"></br>
amount:<input type="text" value="amount"></br>
<input type="submit" value="recharge">
next recharge? Then <a href="Recharge.jsp">Click here to recharge</a>
</form>
</body>
</html>