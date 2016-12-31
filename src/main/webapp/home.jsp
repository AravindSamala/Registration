<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="icon" href="<%=request.getContextPath()%>/IMAGES/favicon.jpg" type="image/gif">
<title>Home</title>


</head>

<body style="background-color:teal">
<form action="<%=request.getContextPath()%>/Forward" method="post">

<table>
<tr>
<td><input type="submit" name="action" value="HOME" style="background-color:purple ;border: none;color: White; padding: 12px 26px;font-size: 20px"/></td>
<td><input type="submit" name="action" value="ABOUT US" style="background-color:purple ;border: none;color: White; padding: 12px 26px;font-size: 20px"/></td>
<td><input type="submit" name="action" value="BOOK YOUR SLOT" style="background-color:purple ;border: none;color: White; padding:12px 26px;font-size: 20px"/></td>
<td><input type="submit" name="action" value="CONTACT US" style="background-color:purple ;border: none;color: White; padding: 12px 26px;font-size: 20px"/></td>
<td><input type="submit" name="action" value="LOGOUT" style="background-color:purple ;border: none;color: White; padding: 12px 26px;font-size: 20px"/></td>
</tr>
</table>

</form>

</body>
</html>
