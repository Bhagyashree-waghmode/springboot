<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br>
<form action="registration" method="post">
<label for="email"> Email: </label>

<input type="email" name="email" id="email" required maxlength="45">
<br>
<br>
<label for="username"> Username: </label>

<input type="username" name="username" id="username" required maxlength="45">
 
<br>
<br>
<label for="password"> Password: </label>

<input type="password" name="password" id="password" required maxlength="45">
 
<br>
<br>
<label for=" mobile"> Mobile no: </label>

<input type="number" name="mobile" id=" mobile">
 
<br>
<br>
<label for="address"> address: </label>

<input type="text" name="address" id="address" required maxlength="45">
 
<br>
<br>

<button>Submit</button>

</form>
	
	<br>

</body>
</html>