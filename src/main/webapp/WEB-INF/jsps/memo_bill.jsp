<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2 align="center">Cash Memo</h2>
	<table border="2" align="center">
		<tr>
			<th>Id</th>
			<td>${bill.id}</td>
		</tr>
		<tr>
			<th>First Name</th>
			<td>${bill.firstName}</td>
		</tr>
		<tr>
			<th>Last Name</th>
			<td>${bill.lastName}</td>
		</tr>
		<tr>
			<th>Email</th>
			<td>${bill.email}</td>
		</tr>
		<tr>
			<th>Mobile</th>
			<td>${bill.mobile}</td>
		</tr>
		<tr>
			<th>Product</th>
			<td>${bill.product}</td>
		</tr>
		<tr>
			<th>Amount</th>
			<td>${bill.amount}</td>
		</tr>
		<tr>
			<th><button onclick="window.print()" >Print</button></th>
			<td><button onclick="history.back()" >Go Back</button></td>
		</tr>
	</table>
	
	
</body>
</html>