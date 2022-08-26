<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Data of one Lead</title>
</head>
<body>
<h2 align="center">Data of one Lead</h2>
<table border="2" align="center">
<tr>
<th>Id</th>
<td>${lead.id}</td>
</tr>
<tr>
<th>First Name</th>
<td>${lead.firstName}</td>
</tr>
<tr>
<th>Last Name</th>
<td>${lead.lastName}</td>
</tr>
<tr>
<th>Email</th>
<td>${lead.email}</td>
</tr>
<tr>
<th>Mobile</th>
<td>${lead.mobile}</td>
</tr>
<tr>
<th>Lead Source</th>
<td>${lead.leadSource}</td>
</tr>
</table>
<form action="convertLead" method="post" align="center">
<input type="hidden" name="id" value="${lead.id}">
<input type="submit" value="Convert">
</form>
<form action="composeEmail" method="post" align="center">
<input type="hidden" name="email" value="${lead.email}">
<input type="submit" value="Send Email">
</form>
</body>
</html>