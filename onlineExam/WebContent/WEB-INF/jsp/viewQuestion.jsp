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
	<c:forEach items="${queList}" var="q">
	<p>${q.question}</p>
	
		<%-- <c:forEach items="${queList.options}" var="ql"> --%>
		
		<%-- </c:forEach> --%>
	<%-- 	<c:forEach items="${ss}" var="ql">
		<p>hi</p>
		</c:forEach> --%>
		<%-- <p>${zz[0]}</p>
		<p>${zz[1]}</p>
		<p>${zz[2]}</p>
		<p>${zz[3]}</p> --%>
		<c:forEach items="${q.optionList}" var="ql">
		<p>hi</p>
		</c:forEach>
		
	</c:forEach>
</body>
</html>