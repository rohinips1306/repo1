<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>

#t2
{
float:right;
margin-top:-300px;
margin-right:100px;
}
table
{
text-align:right;
}
h1
{
color:#2d355c;
}
h4
{
color:brown;
}
</style>
</head>
<body style="background-color:#83c1eb;">
<h1>INSURANCE</h1>
<h4>Create new account</h4>
<form action="./register" method="get">
<table id="t1">
<tr>
<td>Id</td>
<td ><input type="number" name="id"></td>
</tr>
<tr>
<td>Client number</td>
<td><input type="number" name="cn"></td>
</tr>
<tr>
<td>Client type</td>
<td><select name="ctype">
<option></option>
<option>MEDICAL INSURANCE</option>
<option>LIFE INSURANCE</option>
</select>
</tr>
<tr>
<td>Dob</td>
<td><input type="date" name="dob"></td>
</tr>
<tr>
<td>Mobile</td>
<td><input type="number" name="mob"></td>
</tr>
<tr>
<td>Address</td>
<td><input type="text" name="addr" style="height:100px"></td>
</tr>
<tr>
<td>State</td>
<td><input type="text" name="st"></td>
</tr>
<tr>
<td>Initial Amont</td>
<td><input type="number" name="ia"></td>
</tr>
</table>
<table id="t">
<tr>
<td>Name</td>
<td><input type="text" name="user"></td>

</tr>
<tr>
<td>Password</td>
<td><input type="password" name="pwd"></td>
</tr>
<tr>
</td>
<td>Retype password</td>
<td><input type="password" name="cpwd"></td>
<tr>
<td>Age</td>
<td><input type="number" name="age" size="2">Gender
<input type="radio" name="gen">M<input type="radio" name="gen">F</td>
</tr>
<tr>
<td>Email</td>
<td><input type="email" name="em"></td>
</tr>
<tr>
<td>City</td>
<td><input type="text" name="city"></td>
</tr>
<tr>
<td>Nation</td>
<td><input type="text" name="nation"></td>
</tr>
<tr>
<td>No of payment</td>
<td><input type="number" name="nop"></td>
</tr>
<tr>
<td>Date of creation</td>
<td><input type="date" name="doc"></td>
</tr>
</table>
<input type="submit" value="Create Account" >
<a href="index.jsp">HOME</a>
<button>EXIT</button>
</form>
</body>
</html>