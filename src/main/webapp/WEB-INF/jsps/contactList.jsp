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
<table border=2 align="center">

<tr>
<th>Id</th>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
<th>Mobile</th>
<th>Billing</th>
</tr>

<c:forEach items="${contact}" var="contact">

<tr>
<td>${contact.id}</td>
<td><a href="getLeadById?id=${lead.id}">${contact.firstName}</a></td>
<td>${contact.lastName}</td>
<td>${contact.email}</td>
<td>${contact.mobile}</td>
<td><a href="generateBill?id=${contact.id}">billing</a></td>
</tr>

</c:forEach>

</table>
</body>
</html>