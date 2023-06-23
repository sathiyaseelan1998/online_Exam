<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<title>Insert title here</title>
</head>
<body>
	<form:form action="login" modelAttribute="loginBo" method="post">
	<label>Email</label>
	<form:input path="email"/>
	<label>Password</label>
	<form:input path="password"/>
	<form:button>Login</form:button>
	</form:form>
</body>
</html>