<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body style="background-color:teal">
<form action="<%=request.getContextPath()%>/Registration" method="post">
<center>
<fieldset  style="font-size:20px;
  padding:30px;
  width:400px">
  <legend align="left"><font color="purple" size=10>Registration</font></legend>
<table>
<tr>
<td>First Name </td><td><input type="text" name="fname" placeholder="Arvind" required autofocus/></td>
</tr>
<tr>
<td>Last Name </td><td><input type="text" name="lname" placeholder="Samala" required/></td>
</tr>
<tr>
<td>Sex</td><td><input type="radio" name="sex" value="male"/><font size=4px>Male</font><input type="radio" name="sex" value="female"/><font size=4px>Female</font></td>
</tr>
<tr>
<td>Card Number</td><td><input type="text" name="cardno" placeholder="1234-5678-9012"required/></td>
</tr>
<tr>
<td>Mobile</td><td><input type="text" name="mobile" placeholder="9/8/7121351560"required/></td>
</tr>
<tr>
<td>Email Id</td><td><input type="text" name="email" placeholder="abc@xyz.com"required/></td>
</tr>
<tr>
<td>Password</td><td><input type="password" name="password" placeholder="Aa@#123"required/></td>
</tr>
<tr>
<td>Confirm Password</td><td><input type="password" name="confirmpassword" placeholder="Should match with Password"required/></td>
</tr>
<tr>
<td></td>
</tr>
<tr>
<td></td><td><input type="submit" value="register" style="background-color:Purple ;border: none;color: white; padding: 8px 15px;font-size: 16px"/>&nbsp&nbsp<a href="login.jsp">Login</a></td>
</tr>

</table>
</fieldset>
</center>

</form>
</body>
</html>