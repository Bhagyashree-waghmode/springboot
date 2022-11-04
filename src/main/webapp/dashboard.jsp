<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
String msg=(String)request.getParameter("msg");
if(msg!=null){
	%>
	<h1><%=msg %></h1>
<% 
}
%>	

<h1>do u want to change data click on the update</h1>
<a href="update">Update</a>
</body>
</html>