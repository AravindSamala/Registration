<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body style="background-color:teal">
<br>
<br>
<br>


<form action="<%=request.getContextPath()%>/Login" method="post">
<center>
<fieldset style="font-size:20px;
  padding:30px;
  width:300px">
  <legend align="left"><font color="green" size=10>Login</font></legend>
<table>
<tr>
<td>UserName</td><td><input type="text" name="email" placeholder="abc@xyz.com" required autofocus/></td>
</tr>
<tr></tr>
<tr>
<td>Password</td><td><input type="password" name="password" placeholder="Aa@#123" required/></td>
</tr>
<tr></tr>
<tr>
<td></td><td><input type="submit" value="Login"  style="background-color:green ;border: none;color: white; padding: 8px 15px;font-size: 16px"/>&nbsp&nbsp<a href="registration.jsp">Register</a></td>
</tr>
</table>
</fieldset>
</center>
</form>
</body>
</html>