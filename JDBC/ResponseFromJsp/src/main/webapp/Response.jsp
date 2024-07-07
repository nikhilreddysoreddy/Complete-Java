<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>RegForm</title>
</head>
<body>
<%
	String name=request.getParameter("username");
	
%>
<h2> Congratulations <%= name %> you have Successfully Registered</h2>
</body>
</html>