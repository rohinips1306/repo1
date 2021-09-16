<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
h3
{
color:brown;
}
</style>
</head>

<body style="background-color:#83c1eb">
<form  action="./login" method="get" >
<h1>Login</h1>
<table>
<tr>
<td>CLIENT NUMBER</td>
<td><input type="text" name="cn"></td>
</tr>
<tr>
<td>PASSWORD</td>
<td><input type="password" name="pwd"></td>
</tr>
<tr>
<td colspan="2" ><input type="submit" value="Login"><br>
<br>
<input type="reset" value="Clear"></td>
<tr>
</table>
</form>
</body>
</html>
