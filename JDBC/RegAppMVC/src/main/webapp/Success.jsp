<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body bgcolor='cyan'>
<h1><marquee>Successfully registered</marquee></h1>
<% String name=(String)session.getAttribute("name"); %>
<h3>hey <%= name%> you have registered successfully</h3>
</body>
</html>