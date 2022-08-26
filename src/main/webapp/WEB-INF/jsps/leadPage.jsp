<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create Lead</title>
</head>
<body>

<form action="insertLead" method="post" align="center">
<h2>Create New Lead</h2>
<pre>
<label>First Name</label>
<input type="text" name="firstName">
<label>Last Name</label>
<input type="text" name="lastName">
<label>Email</label>
<input type="email" name="email">
<label>Mobile</label>
<input type="text" name="mobile">
<label>LeadSource</label>
<select name="leadSource">
<option>Select</option>
<option value="TvAds">Tv Ads</option>
<option value="Radio">Radio</option>
<option value="Newspaper">Newspaper</option>
<option value="SocialMedia">Social Sites</option>
<option value="EmailAds">Email Ads</option>
<option value="Website">Websites</option>
<option value="Refferal">Refferal</option>
</select>
<input type="submit" value="Save">
</pre>
</form>
</body>
</html>