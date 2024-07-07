<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Failed</title>
</head>
<body bgcolor='cyan'>
<h1><marquee>Registration failed</marquee></h1>
<% String name=(String)session.getAttribute("name"); %>
<h3>hey <%= name%> you failed to register</h3>
</body>
</html>