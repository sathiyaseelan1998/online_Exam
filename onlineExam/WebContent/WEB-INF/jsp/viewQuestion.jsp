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
	<c:forEach items="queList" var="q">
	<p>${q.question}</p>
	<form:radiobuttons path="answer1" name="answer" value="${q.answer1}"/>${q.answer1}
	<form:radiobuttons path="answer2" name="answer" value="${q.answer2}"/>${q.answer2}
	<form:radiobuttons path="answer3" name="answer" value="${q.answer3}"/>${q.answer3}
	<form:radiobuttons path="answer4" name="answer" value="${q.answer4}"/>${q.answer4}
	
	</c:forEach>
</body>
</html>