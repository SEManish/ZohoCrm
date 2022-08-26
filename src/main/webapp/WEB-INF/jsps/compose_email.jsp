<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>email</title>
</head>
<body>
<h2>Send Email</h2>
<form action="SendEmail" method="post">
<pre >
To<input type="text" name="to" value="${email}">
subject<input type="text" name="subject">
Content<textarea class="form-control" name="content" rows="7"></textarea>
<input type="submit" value="Send Email">
</pre>
</form>
</body>
</html>