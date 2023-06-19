<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<title>Online Exam</title>
</head>
<body>
<form:form action="createProfessor" modelAttribute="professorBo" method="post">

<label>Name</label>
<form:input path="name" placeholder="Enter name"/>

<label>email</label>
<form:input path="email" placeholder="Enter Email"/>

<label>Confirm Email</label>
<form:input path="confirmEmail" placeholder="Enter Confirm Email"/>

<label>Password</label>
<form:input path="password" placeholder="Enter Password"/>

<label>Confirm Password</label>
<form:input path="confirmPassword" placeholder="Enter Confirm Password"/>

<label>Mobile</label>
<form:input path="mobile" placeholder="Enter Mobile Number"/>

<form:button>Register</form:button>

</form:form>
</body>
</html>