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
mobilenumber:<input type="text" name="mobilenumber"></br>
<!-- network:<input type="text" name="network"></br> -->

Network :<select name="network">
<option value="airtel">airtel</option>
<option value="idea">idea</option>
<option value="vodafone">vodafone</option>
</select> </br>
amount:<input type="text" name="amount"></br>
<input type="submit" value="Proceed with recharge">
next recharge? Then <a href="HomePageFail.jsp">Click here to Recharge</a>
</form>
</body>
</html>