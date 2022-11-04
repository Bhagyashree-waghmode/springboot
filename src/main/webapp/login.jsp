<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action = "login" method="post">
<%
String msg=(String)request.getParameter("msg");
if(msg!=null){
	
	%>
	<h1><%=msg %></h1>
<% 
}
%>	

<h1>enter the details for login</h1>
email: <input type = "text" name = "email" required>
<br>
<br>
password: <input type = "password" name = "password" required>
<br>
<br>
<input type = "submit" >

</form>
</form>
</body>
</html>