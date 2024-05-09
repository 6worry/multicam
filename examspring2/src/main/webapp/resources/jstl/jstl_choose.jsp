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
	<c:choose>
		<c:when test="${param.name == null}">
			<h3>not user</h3>
		</c:when>
		<c:otherwise>
			<h3>user</h3>
		</c:otherwise>
	</c:choose>
	
	<c:choose>
		<c:when test="${param.grade.contains('A') || param.grade.contains('a')}">
			<h3>A</h3>
		</c:when>
		<c:when test="${param.grade.contains('B') || param.grade.contains('b')}">
			<h3>B</h3>
		</c:when>
		<c:when test="${param.grade.contains('C') || param.grade.contains('c')}">
			<h3>C</h3>
		</c:when>
		<c:otherwise>
			<h3>etc</h3>
		</c:otherwise>
	</c:choose>
</body>
</html>