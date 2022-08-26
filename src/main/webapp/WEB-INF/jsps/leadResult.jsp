<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Leads</title>
</head>
<body>
<h2 align="center">All Leads</h2>
<a href="/">Generate Lead</a>
<table border=2 align="center">
<tr>
<th>Id</th>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
<th>Mobile</th>
<th>Lead Source</th>
</tr>

<c:forEach items="${lead}" var="lead">

<tr>
<td>${lead.id}</td>
<td><a href="getLeadById?id=${lead.id}">${lead.firstName}</a></td>
<td>${lead.lastName}</td>
<td>${lead.email}</td>
<td>${lead.mobile}</td>
<td>${lead.leadSource}</td>
</tr>

</c:forEach>

</table>
</body>
</html>