<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Registration</title>
</head>
<body>
<h2>Create new Registration</h2>
<form action="/user/createAccountAPI" method="post">
    <pre>
        first name<input type="text" name="firstName">
        last name<input type="text" name="lastName">
        Username<input type="text" name="username">
        email<input type="email" name="email">
        password<input type="password" name="password">
        <input type="submit" value="save">
    </pre>
</form>
</body>
</html>
