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
	<form:form action="createQuestion" modelAttribute="questionBo" method="post">
	<label>Question</label>
	<form:input path="question"/>
	
	<label>Answer1</label>
	<form:input path="answer1"/>
	
	<label>Answer2</label>
	<form:input path="answer2"/>
	
	<label>Answer3</label>
	<form:input path="answer3"/>
	
	<label>Answer4</label>
	<form:input path="answer4"/>
	
	<button>Create Question</button>
	
	</form:form>
</body>
</html>