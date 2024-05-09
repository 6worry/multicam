<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>${param.name}</h3>
	<h3>${param.addr}</h3>
	<h3>${param.age}</h3>
	
	<c:if test="${param.name.contains('test')}">
		<h3>${param.name} ㅎㅇ여</h3>
	</c:if>
	
	<c:if test="${param.age >= 70}">
		<h3>Silver</h3>
	</c:if>
</body>
</html>