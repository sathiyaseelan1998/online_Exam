<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Email</th>
		<th>Password</th>
		<th>Mobile</th>
		<th>Edit</th>
		<th>Delete</th>
	</tr>
	<c:forEach items="${list}" var="l">
	<tr>
		<td>${l.id}</td>
		<td>${l.name}</td>
		<td>${l.email}</td>
		<td>${l.password}</td>
		<td>${l.mobile}</td>
		<td><a href="edit?id=${l.id}">Edit</a></td>
		<td><a href="delete?id=${l.id}">Delete</a></td>
	</tr>
	
	</c:forEach>
</table>
</body>
</html>