<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
 <h3>Login</h3>
 <form action="verifyLogin" method="post">
emailid<input type="text" name="emailId">
password<input type="password" name="password">
 <input type="submit" value="login">
 </form>
${msg }
</body>
</html>