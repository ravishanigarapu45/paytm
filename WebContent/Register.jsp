<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="Registration" action="/Paytm/Register" method="get">

first name:<input type="text" name="fname"/></br>
last name:<input type="text" name="lname"/></br>
MobileNumber:<input type="text" name="mobilenumber"></br>
mail id:<input type="text" name="mail"/></br>
password:<input type="password" name="password"/></br>
 retype password:<input type="password" name="password"/></br>
 select your gender
  <input type="radio" name="gender" value="male" checked> Male<br>
  <input type="radio" name="gender" value="female"> Female<br>
  <input type="radio" name="gender" value="other"> Other
<input type="submit" value ="Register"/>
<a href="Pay.jsp"></a>
</form>

</body>
</html>